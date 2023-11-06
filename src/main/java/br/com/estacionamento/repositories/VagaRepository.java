package br.com.estacionamento.repositories;

import br.com.estacionamento.entities.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {

    Vaga findByNumVaga(long numVaga);
//    @Modifying(clearAutomatically = true)
//    @Query(value = "UPDATE Vaga v SET  v.status = TRUE WHERE v.numVaga = 1")
    //@Query(value = "SELECT status FROM Vaga WHERE numVaga = 1")
    Vaga save(Vaga vaga);
}
