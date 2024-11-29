package com.api.atol2.funcionarios;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String nome, sobrenome, cpf, telefone;



}
