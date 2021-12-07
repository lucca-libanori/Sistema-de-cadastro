package com.company;

import java.util.ArrayList;

public class Listarprodutos{

    private ArrayList<Produto> produto;

    public Listarprodutos(){
        this.produto = new ArrayList<Produto>();
    }

    public void listarProdutos(ArrayList<Produto> produto){
        for (int i = 0; i < produto.size(); i++) {
            System.out.println("Descrição: " + produto.get(i).getDescricao());
            System.out.println("Quantidade: " + produto.get(i).getQuantidade());
            System.out.println("Preço: " + produto.get(i).getPreco());
            System.out.println("Fornecedor: " + produto.get(i).getFornecedor() + "\n");
        }
    }

    public void addProdutos(Produto p){
        this.produto.add(p);
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }
}
