package br.com.estacionamento.useCases;

import br.com.estacionamento.entities.Comprovante;
import br.com.estacionamento.entities.Veiculo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RecebeVeiculo {

    public Comprovante executar (Veiculo veiculo){

        var comprovante = new Comprovante();

        comprovante.setModelo(veiculo.getModelo());
        comprovante.setPlaca(veiculo.getPlaca());
        comprovante.setDataEHora(LocalDateTime.now());

        return comprovante;
    }

}