package br.com.folhaponto.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Funcionario {
    @Id
    private int cpf;
    private String nome;
    private String cargo;
    private String idade;
    private String matricula;
    private Date dataNascimento;

}
