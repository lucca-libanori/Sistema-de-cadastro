package com.company;

import java.util.Date;

public class Fornecedores extends Contribuintes{

    private String razaoSocial;
    private String email;
    private String cnpj;
    private int numero;

    public Fornecedores(String nome, String razaoSocial, String cnpj, int telefone, String email, String cidade,
                        String estado, String pais, String endereco, int numero, Date dataCadastro) {
        this.setNome(nome);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.setTelefone(telefone);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setEndereco(endereco);
        this.numero = numero;
        this.email = email;
        this.setDataCadastro(dataCadastro);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
