package br.com.folhaponto.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cpf;

    @NotNull
    private String nome;

    private String cargo;

    private LocalDate dtNascimento;

    @GeneratedValue
    @NotNull
    private String matricula;

    @OneToOne
    private FolhaDePonto folhaDePonto;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
}
