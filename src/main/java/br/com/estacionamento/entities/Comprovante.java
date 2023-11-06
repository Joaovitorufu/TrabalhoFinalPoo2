package br.com.estacionamento.entities;

import java.time.LocalDateTime;

public class Comprovante {
    private int id;
    private String modelo;
    private String placa;
    private LocalDateTime dataEHora;
    private long numVaga;


    public Comprovante(int id, String modelo, String placa, LocalDateTime dataEHora, long numVaga) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.dataEHora = dataEHora;
        this.numVaga = numVaga;
    }



    public Comprovante() {}


    public long getNumVaga() {
        return numVaga;
    }

    public void setNumVaga(long numVaga) {
        this.numVaga = numVaga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(LocalDateTime dataEHora) {
        this.dataEHora = dataEHora;
    }



}


