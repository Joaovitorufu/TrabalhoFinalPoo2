package br.com.estacionamento.useCases;

import br.com.estacionamento.entities.Comprovante;
import br.com.estacionamento.entities.Vaga;
import br.com.estacionamento.entities.Veiculo;
import br.com.estacionamento.repositories.VagaRepository;
import br.com.estacionamento.useCases.exceptions.VagaOcupadaException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RecebeVeiculo {

    @Autowired
    private final VagaRepository vagaRepository;

    public RecebeVeiculo(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public Comprovante executar (Veiculo veiculo, long numVaga){

        var comprovante = new Comprovante();

        comprovante.setModelo(veiculo.getModelo());
        comprovante.setPlaca(veiculo.getPlaca());
        comprovante.setDataEHora(LocalDateTime.now());

        if(verificaVaga(numVaga)) {
            throw new VagaOcupadaException();
        } else {
            atualizaVagaParaOcupada(numVaga);
            comprovante.setNumVaga(numVaga);
        }

        return comprovante;
    }

    private boolean verificaVaga(long numVaga){
        var vaga = vagaRepository.findByNumVaga(numVaga);

        return vaga.isStatus();
    }

    @Transactional
    public void atualizaVagaParaOcupada(long numVaga){
        vagaRepository.findById(numVaga)
                .map(vaga -> {
                    vaga.setNumVaga((int) numVaga);
                    vaga.setStatus(true);
                    vagaRepository.save(vaga);
                    return vaga;
                });
    }

}
