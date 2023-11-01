package br.com.estacionamento.controllers.model.mapper;

import br.com.estacionamento.controllers.request.VeiculoRequest;
import br.com.estacionamento.controllers.response.ComprovanteResponse;
import br.com.estacionamento.entities.Comprovante;
import br.com.estacionamento.entities.Veiculo;

public class EstacionamentoControllerAdapter {

    public ComprovanteResponse map(Comprovante comprovante){
        var comprovanteResponse = new ComprovanteResponse();
        comprovanteResponse.setDataEHora(comprovante.getDataEHora());
        comprovanteResponse.setPlaca(comprovante.getPlaca());
        comprovanteResponse.setModelo(comprovante.getModelo());
        comprovanteResponse.setId(comprovante.getId());

        return comprovanteResponse;
    }

    public Veiculo mapRequest(VeiculoRequest veiculoRequest){
        var veiculo = new Veiculo();
        veiculo.setCor(veiculoRequest.getCor());
        veiculo.setPlaca(veiculoRequest.getPlaca());
        veiculo.setModelo(veiculoRequest.getModelo());

        return veiculo;
    }
}
