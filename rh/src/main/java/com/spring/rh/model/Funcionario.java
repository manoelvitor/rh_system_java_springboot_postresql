package com.spring.rh.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Entity // ANOTAÇÃO PARA CRIAÇÃO DE UMA ENTIDADE DO BANCO DE DADOS
@Table(name = "tb_funcionario") // NOME DA ENTIDADE(TABLE NO CASO
public class Funcionario {

    @Id //apontando o id como id da tabela
    @GeneratedValue(strategy = GenerationType.AUTO) //PARA GERAR O ATRIBUTO ID AUTOMATICAMENTE
    private Long id;

    // VALIDAÇÃO PARA NÃO DEIXAR NULL
    private String nome;

    //@NotBlank
    private String matricula;

    //@NotBlank
    private String rg;

    //@NotBlank
    private String cpf;

    //@NotBlank
    private String tel;

    private String email;

    //@NotBlank
    private String endereco;

    //@NotBlank
    private String departamento;

    //@NotBlank
    private String cargo;

    //@NotBlank
    private float salario;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") //formato da data
    private LocalDate dataCadastro;

    public Funcionario(String nome1, String s, String nome, String cargo, String departamento, String endereco, String rg, String cpf, Float salario, String email) {
    }

    public Funcionario() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


 


}
