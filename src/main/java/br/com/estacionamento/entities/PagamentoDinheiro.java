package br.com.estacionamento.entities;

public class PagamentoDinheiro implements PagamentoStrategy{
    @Override
    public void pagar(double total) {
        System.out.println("Lógica para pagar com dinheiro");
    }
}
