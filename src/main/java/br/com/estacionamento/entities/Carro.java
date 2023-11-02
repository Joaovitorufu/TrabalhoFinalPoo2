package br.com.estacionamento.entities;

public class Carro extends Veiculo {

    private String marca;
    private String categoria; //futuramente pode virar um enum -> exemplos (Particular,Oficial, aluguel).
    private int qtKmRodado;
    private int capacidadeKG;


}
