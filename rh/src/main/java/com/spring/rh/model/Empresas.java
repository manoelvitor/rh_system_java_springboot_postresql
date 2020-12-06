package com.spring.rh.model;

import javax.persistence.*;

@Entity
@Table(name= "tb_empresa")
public class Empresas {
    @Id //apontando o id como id da tabela
    @GeneratedValue(strategy = GenerationType.AUTO) //PARA GERAR O ATRIBUTO ID AUTOMATICAMENTE
    Long id;
    String nome;
    String ramo;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }


}
