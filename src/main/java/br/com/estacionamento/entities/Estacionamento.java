package br.com.estacionamento.entities;


import java.util.ArrayList;
import java.util.List;



public class Estacionamento {
    private long id;
    private List<Veiculo> veiculosEstacionados;
    private List<Vaga> vagas;
    private List<Integer> vagasOcupadas;

    public List<Integer> getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(List<Integer> vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public Estacionamento() {
    }

    public List<Veiculo> getVeiculosEstacionados() {
        return veiculosEstacionados;
    }

    public void setVeiculosEstacionados(List<Veiculo> veiculosEstacionados) {
        this.veiculosEstacionados = veiculosEstacionados;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
}
