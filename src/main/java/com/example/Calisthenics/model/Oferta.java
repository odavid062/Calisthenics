package com.example.Calisthenics.model;

import com.example.Calisthenics.service.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class Oferta {

    private final Cliente cliente;
    private final Money totalValue;
    private final List<Item> items;
    private boolean confirmed;
    private final NotificationService notificationService;

    public Oferta(Cliente cliente, Money totalValue, NotificationService notificationService) {
        this.cliente = cliente;
        this.totalValue = totalValue;
        this.notificationService = notificationService;
        this.items = new ArrayList<>();
        this.confirmed = false;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Money calculateDiscount() {
        Money discount = new Money(0);

        if (totalValue.getValue() > 1000) {
            discount = discount.add(totalValue.multiply(0.1));

            if (items.size() > 5) {
                discount = discount.add(totalValue.multiply(0.05));
            }
        }
        return discount;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder("Oferta por " + cliente.getName() + "\n");

        for (Item item : items) {
            report.append("Item: ").append(item.getDescricao()).append("\n");
        }

        report.append("Total: ").append(totalValue.getValue()).append("\n");
        report.append("Discount: ").append(calculateDiscount().getValue());

        return report.toString();
    }

    public void confirmOferta() {
        if (!confirmed) {
            confirmed = true;
            notificationService.sendConfirmation("Oferta confirmada para " + cliente.getName());
        }
    }
}
