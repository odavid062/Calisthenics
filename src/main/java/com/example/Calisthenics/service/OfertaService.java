package com.example.Calisthenics.service;

import com.example.Calisthenics.model.Cliente;
import com.example.Calisthenics.model.Item;
import com.example.Calisthenics.model.Money;
import com.example.Calisthenics.model.Oferta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfertaService {
    private final List<Oferta> ofertas = new ArrayList<>();

    public void criarOferta(Cliente cliente, Money totalValue, NotificationService notificationService) {
        Oferta oferta = new Oferta(cliente, totalValue, notificationService);
        ofertas.add(oferta);
    }

    public void addItemToOferta(int ofertaId, Item item) {
        getOfertaById(ofertaId).addItem(item);
    }

    public String getOfertaReport(int ofertaId) {
        return getOfertaById(ofertaId).generateReport();
    }

    public void confirmOferta(int ofertaId) {
        getOfertaById(ofertaId).confirmOferta();
    }

    private Oferta getOfertaById(int ofertaId) {
        if (ofertaId < 0 || ofertaId >= ofertas.size()) {
            throw new IllegalArgumentException("Id inválido para oferta.");
        }
        return ofertas.get(ofertaId);
    }
}
