package com.company;

import java.util.ArrayList;

public class ListarVendas {

    private ArrayList<Vendas> vendas;

    public ListarVendas(){
        this.vendas = new ArrayList<Vendas>();
    }

    public void listarVendas(ArrayList<Vendas> vendas){
        for (int i = 0; i < vendas.size(); i++) {
            System.out.println("Nome: " + vendas.get(i).getCliente());
            System.out.println("Produto: " + vendas.get(i).getProduto());
            System.out.println("Quantidade: " +vendas.get(i).getQuantidade());
            System.out.println("Pagamento: " + vendas.get(i).getTipoPagamento() + "\n");
        }
    }

    public void addVendas(Vendas v){
        this.vendas.add(v);
    }

    public ArrayList<Vendas> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Vendas> vendas) {
        this.vendas = vendas;
    }
}
