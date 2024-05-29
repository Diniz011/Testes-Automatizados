package br.fiap.com.GestaoTrafego.repository;

import br.fiap.com.GestaoTrafego.model.PadraoTrafego;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;

public interface PadraoTrafegoRepository extends JpaRepository<PadraoTrafego, Long> {

    // Método para buscar padrão de tráfego pelo horário da análise
    List<PadraoTrafego> findByHorarioAnalise(LocalTime horarioAnalise);

    // Método para buscar padrão de tráfego pelo fluxo médio de veículos
    List<PadraoTrafego> findByFluxoMedioVeiculos(Double fluxoMedioVeiculos);

    // Método para buscar padrão de tráfego pelos horários de pico
    List<PadraoTrafego> findByHorariosPicoContaining(LocalTime horarioPico);

    // Método para buscar padrão de tráfego pelas áreas congestionadas
    List<PadraoTrafego> findByAreasCongestionadasContaining(String areaCongestionada);
}
