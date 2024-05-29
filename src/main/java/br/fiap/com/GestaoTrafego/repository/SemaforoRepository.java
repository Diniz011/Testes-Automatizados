package br.fiap.com.GestaoTrafego.repository;

import br.fiap.com.GestaoTrafego.model.Semaforo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SemaforoRepository extends JpaRepository<Semaforo, Long> {

    // Método para buscar semáforo pela localização
    List<Semaforo> findByLocalizacao(String localizacao);

    // Método para buscar semáforo pelo status (Verde, Amarelo, Vermelho)
    List<Semaforo> findByStatus(String status);

    // Método para buscar semáforo pelo último ajuste
    List<Semaforo> findByUltimoAjuste(LocalDateTime ultimoAjuste);

}
