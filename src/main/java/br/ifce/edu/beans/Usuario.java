package br.ifce.edu.beans;

import java.util.Date;

public class Usuario {

    private String nome;
    private String cpf;
    private Date dtNascimento;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, Date dtNascimento) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
