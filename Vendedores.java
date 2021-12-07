package com.company;


import java.util.Date;

public class Vendedores extends Contribuintes{

    private String sobrenome;
    private String dataNascimento;
    private String cpf;
    private String login;
    private String senha;

    public Vendedores(String nome, String sobrenome, String dataNascimento, int telefone, String cpf, String cidade, String estado, String pais, String endereco, Date dataCadastro, String login, String senha) {
        this.setNome(nome);
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.setTelefone(telefone);
        this.cpf = cpf;
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setEndereco(endereco);
        this.setDataCadastro(dataCadastro);
        this.login = login;
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
