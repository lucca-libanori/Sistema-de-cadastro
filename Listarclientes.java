package com.company;

import java.util.ArrayList;

public class Listarclientes {

    private ArrayList<Clientes> clientes;

    public Listarclientes(){
        this.clientes = new ArrayList<Clientes>();
    }

    public void listarClientes(ArrayList<Clientes> clientes){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Nome: " + clientes.get(i).getNome());
            System.out.println("Sobrenome: " + clientes.get(i).getSobrenome());
            System.out.println("Data de nascimento: " + clientes.get(i).getDataNascimento());
            System.out.println("Telefone: " + clientes.get(i).getTelefone());
            System.out.println("CPF: " + clientes.get(i).getCpf());
            System.out.println("Cidade: " + clientes.get(i).getCidade());
            System.out.println("Estado: " + clientes.get(i).getEstado());
            System.out.println("País: " + clientes.get(i).getPais());
            System.out.println("Endereço: " + clientes.get(i).getEndereco());
            System.out.println("Número: " + clientes.get(i).getNumero());
            System.out.println("Data de cadastro: " + clientes.get(i).getDataCadastro() + "\n");
        }
    }

    public void addClientes(Clientes c){
        this.clientes.add(c);
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }
}
