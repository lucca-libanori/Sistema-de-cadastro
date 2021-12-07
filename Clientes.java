package com.company;

import java.util.Date;

public class Clientes extends Contribuintes{

    private String dataNascimento;
    private String cpf;
    private String sobrenome;
    private int numero;

    public Clientes(String nome, String sobrenome, String dataNascimento, int telefone, String cpf, String cidade, String estado, String pais, String endereco, int numero, Date dataCadastro){
        this.setNome(nome);
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.setTelefone(telefone);
        this.cpf = cpf;
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setEndereco(endereco);
        this.numero = numero;
        this.setDataCadastro(dataCadastro);
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
