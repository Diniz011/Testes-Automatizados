package br.fiap.com.GestaoTrafego.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tbl_padrao_trafego")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PadraoTrafego {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PADRAO_TRAFEGO"
    )
    @SequenceGenerator(
            name = "SEQ_PADRAO_TRAFEGO",
            sequenceName = "SEQ_PADRAO_TRAFEGO",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "horario_analise")
    private LocalTime horarioAnalise; // horário da análise

    @Column(name = "fluxo_medio_veiculos")
    private Double fluxoMedioVeiculos; // fluxo médio de veículos

    @ElementCollection
    @Column(name = "horarios_pico")
    private List<LocalTime> horariosPico; // horários de pico

    @ElementCollection
    @Column(name = "areas_congestionadas")
    private List<String> areasCongestionadas; // áreas congestionadas
}
