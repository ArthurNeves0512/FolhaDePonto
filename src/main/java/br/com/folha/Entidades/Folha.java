package br.com.folha.Entidades;

import jakarta.persistence.*;
import br.com.folha.Entidades.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Folha implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Funcionario funcionario;
    private String mes;
    private ZonedDateTime pontoInicio;
    private ZonedDateTime pontoFinal;

    private LocalDateTime horasTrabalhadas;


}
