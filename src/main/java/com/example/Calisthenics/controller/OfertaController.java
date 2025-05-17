package com.example.Calisthenics.controller;

import com.example.Calisthenics.model.Cliente;
import com.example.Calisthenics.model.Item;
import com.example.Calisthenics.model.Money;
import com.example.Calisthenics.service.NotificationService;
import com.example.Calisthenics.service.OfertaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ofertas")
public class OfertaController {

    private final OfertaService ofertaService;

    public OfertaController(OfertaService ofertaService) {
        this.ofertaService = ofertaService;
    }

    @PostMapping
    public String criarOferta(@RequestParam String clienteName, @RequestParam double totalValue) {
        Cliente cliente = new Cliente(clienteName);
        Money money = new Money(totalValue);
        NotificationService notificationService = new NotificationService();

        ofertaService.criarOferta(cliente, money, notificationService);
        return "Oferta criada com sucesso!";
    }

    @PostMapping("/{ofertaId}/items")
    public String addItem(@PathVariable int ofertaId, @RequestParam String descricao) {
        Item item = new Item(descricao);
        ofertaService.addItemToOferta(ofertaId, item);
        return "Item adicionado com sucesso!";
    }

    @GetMapping("/{ofertaId}")
    public String getOfertaReport(@PathVariable int ofertaId) {
        return ofertaService.getOfertaReport(ofertaId);
    }

    @PutMapping("/{ofertaId}/confirm")
    public String confirmOferta(@PathVariable int ofertaId) {
        ofertaService.confirmOferta(ofertaId);
        return "Oferta confirmada com sucesso!";
    }
}
