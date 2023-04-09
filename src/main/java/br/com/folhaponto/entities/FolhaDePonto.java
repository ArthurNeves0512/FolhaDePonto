package br.com.folhaponto.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FolhaDePonto {
    @Id
    @OneToOne(mappedBy = "cpf")
    private Funcionario funcionario;

    private LocalDateTime primeiraBatidaChegada;

    private LocalDateTime primeiraBatidaSaida;

    private LocalDateTime segundaBatidaChegada;

    private LocalDateTime segundaBatidaSaida;

    private LocalTime horasTrabalhadas;

}
