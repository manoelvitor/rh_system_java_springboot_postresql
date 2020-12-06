package com.spring.rh.model;

import javax.persistence.*;

@Entity
@Table(name= "tb_vagas")
public class Vagas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //PARA GERAR O ATRIBUTO ID AUTOMATICAMENTE
    Long id;

    String nome;

    String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
  
