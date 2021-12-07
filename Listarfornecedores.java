package com.company;

import java.util.ArrayList;

public class Listarfornecedores {

    private ArrayList<Fornecedores> fornecedores;

    public Listarfornecedores(){
        this.fornecedores = new ArrayList<Fornecedores>();
    }

    public void listarFornecedores(ArrayList<Fornecedores> fornecedores){
        for (int i = 0; i < fornecedores.size(); i++) {
            System.out.println("Nome: " + fornecedores.get(i).getNome());
            System.out.println("Razão social: " + fornecedores.get(i).getRazaoSocial());
            System.out.println("Cnpj: " + fornecedores.get(i).getCnpj());
            System.out.println("Telefone: " + fornecedores.get(i).getTelefone());
            System.out.println("Email: " + fornecedores.get(i).getEmail());
            System.out.println("Cidade: " + fornecedores.get(i).getCidade());
            System.out.println("Estado: " + fornecedores.get(i).getEstado());
            System.out.println("País: " + fornecedores.get(i).getPais());
            System.out.println("Endereço: " + fornecedores.get(i).getEndereco());
            System.out.println("Número: " + fornecedores.get(i).getNumero());
            System.out.println("Data de cadastro: " + fornecedores.get(i).getDataCadastro() + "\n");
        }
    }

    public void addFornecedores(Fornecedores f){
        this.fornecedores.add(f);
    }

    public ArrayList<Fornecedores> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedores> fornecedores) {
        this.fornecedores = fornecedores;
    }
}
