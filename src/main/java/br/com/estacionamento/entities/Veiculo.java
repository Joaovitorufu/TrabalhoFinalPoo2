package br.com.estacionamento.entities;

import jakarta.persistence.*;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cor;
    private String modelo;
    private String placa;

    private long idVaga;

    public Veiculo() {}

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(long idVaga) {
        this.idVaga = idVaga;
    }
}
