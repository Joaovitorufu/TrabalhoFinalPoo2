package br.com.estacionamento.controllers.response;

import java.time.LocalDateTime;

public class ComprovanteResponse {
    private int id;
    private String modelo;
    private String placa;
    private LocalDateTime dataEHora;
    private long numVaga;

    public ComprovanteResponse() {}

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
