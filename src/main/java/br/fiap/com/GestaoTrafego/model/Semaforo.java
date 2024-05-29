package br.fiap.com.GestaoTrafego.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_semaforos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Semaforo {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_SEMAFOROS"
    )
    @SequenceGenerator(
            name = "SEQ_SEMAFOROS",
            sequenceName = "SEQ_SEMAFOROS",
            allocationSize = 1
    )
    private Long id;

    private String localizacao;
    private String status; // Ex: Verde, Amarelo, Vermelho
    @Column(name = "ultimo_ajuste")
    private LocalDateTime ultimoAjuste; // Data e hora do último ajuste manual
    private int duracaoVerde; // Duração do sinal verde em segundos
    private int duracaoAmarelo; // Duração do sinal amarelo em segundos
    private int duracaoVermelho; // Duração do sinal vermelho em segundos
}
