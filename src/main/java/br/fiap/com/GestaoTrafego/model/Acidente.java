package br.fiap.com.GestaoTrafego.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_acidentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

//Este modelo representa um acidente de trânsito detectado pelo sistema.

public class Acidente {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_ACIDENTES"
    )
    @SequenceGenerator(
            name = "SEQ_ACIDENTES",
            sequenceName = "SEQ_ACIDENTES",
            allocationSize = 1
    )
    private Long id;
    private String localizacao; //localização do acidente
    private String gravidade; //grave, médio, leve
    @Column(name = "data_acidente")
    private LocalDate dtAcidente; //data do acidente
    private String horario; //horário do acidente
    private String descricao; //descrição do acidente
}
