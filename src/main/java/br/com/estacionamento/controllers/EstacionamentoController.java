package br.com.estacionamento.controllers;

import br.com.estacionamento.controllers.model.mapper.EstacionamentoControllerAdapter;
import br.com.estacionamento.controllers.request.VeiculoRequest;
import br.com.estacionamento.controllers.response.ComprovanteResponse;
import br.com.estacionamento.entities.Comprovante;
import br.com.estacionamento.useCases.RecebeVeiculo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estacionamento")
public class EstacionamentoController {

    private RecebeVeiculo recebeVeiculo;
    private EstacionamentoControllerAdapter adapter = new EstacionamentoControllerAdapter();

    public EstacionamentoController(RecebeVeiculo recebeVeiculo){
        this.recebeVeiculo = recebeVeiculo;
    }


    //recebendo um veículo e devolvendo um comprovante de estacionamento.
    @PostMapping
    public ComprovanteResponse recebeVeiculo(@RequestBody VeiculoRequest veiculoRequest){
        return adapter.map(recebeVeiculo.executar(adapter.mapRequest(veiculoRequest), 1));
    }
}
