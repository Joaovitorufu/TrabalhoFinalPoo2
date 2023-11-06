package br.com.estacionamento.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    private int numVaga;
    private boolean status;
    public Vaga() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
