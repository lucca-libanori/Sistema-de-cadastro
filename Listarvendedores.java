package com.company;


import java.util.ArrayList;

public class Listarvendedores {

    private ArrayList<Vendedores> vendedores;

    public Listarvendedores(){
        this.vendedores = new ArrayList<Vendedores>();
    }

    public void listarVendedores(ArrayList<Vendedores> vendedores){
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println("Nome: " + vendedores.get(i).getNome());
            System.out.println("Sobrenome: " + vendedores.get(i).getSobrenome());
            System.out.println("Data de nascimento: " + vendedores.get(i).getDataNascimento());
            System.out.println("Telefone: " + vendedores.get(i).getTelefone());
            System.out.println("CPF: " + vendedores.get(i).getCpf());
            System.out.println("Cidade: " + vendedores.get(i).getCidade());
            System.out.println("Estado: " + vendedores.get(i).getEstado());
            System.out.println("País: " + vendedores.get(i).getPais());
            System.out.println("Endereço: " + vendedores.get(i).getEndereco());
            System.out.println("Data de Cadastro: " + vendedores.get(i).getDataCadastro());
            System.out.println("Login: " + vendedores.get(i).getLogin());
            System.out.println("Senha: " + vendedores.get(i).getSenha() + "\n");
        }
    }

    public void addVendedores(Vendedores v){
        this.vendedores.add(v);
    }

    public ArrayList<Vendedores> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedores> vendedores) {
        this.vendedores = vendedores;
    }

}
