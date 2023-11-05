package br.com.estacionamento.entities;

public class Vaga {
    private int numVaga;
    private boolean status;

    public Vaga() {

    }

    public int getNumVaga() {
        return numVaga;
    }

    public void setNumVaga(int numVaga) {
        this.numVaga = numVaga;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
