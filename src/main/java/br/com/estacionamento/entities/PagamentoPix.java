package br.com.estacionamento.entities;

public class PagamentoPix implements PagamentoStrategy{
    @Override
    public void pagar(double total) {
        System.out.println("Lógica para pagar com Pix");
    }
}
