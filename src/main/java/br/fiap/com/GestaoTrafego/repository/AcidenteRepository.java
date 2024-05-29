package br.fiap.com.GestaoTrafego.repository;

import br.fiap.com.GestaoTrafego.model.Acidente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AcidenteRepository extends JpaRepository<Acidente, Long> {

    // Método para buscar acidente pela localização
    List<Acidente> findByLocalizacao(String localizacao);

    // Método para buscar pela gravidade do acidente
    List<Acidente> findByGravidade(String gravidade);

    // Método para buscar acidente pelo horário
    List<Acidente> findByHorario(String horario);

    // Método para buscar acidente pela data do acidente
    List<Acidente> findByDtAcidente(LocalDateTime dtAcidente);
}
