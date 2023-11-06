package br.com.estacionamento.entities;

public class PagamentoCartaoDebito implements PagamentoStrategy{

    @Override
    public void pagar(double total) {
        System.out.println("Lógica para pagar com Cartão de Débito");
    }
}
