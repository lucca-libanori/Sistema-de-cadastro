package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendas {

    private String cliente;
    private String produto;
    private int quantidade;
    private String tipoPagamento;
    private static double credito = 0;
    private static double debito = 0;
    private static double dinheiro = 0;


    public Vendas(String cliente, String produto, int quantidade, String tipoPagamento) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipoPagamento = tipoPagamento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static double getCredito() {
        return credito;
    }

    public static void setCredito(double credito) {
        Vendas.credito = credito;
    }

    public static double getDebito() {
        return debito;
    }

    public static void setDebito(double debito) {
        Vendas.debito = debito;
    }

    public static double getDinheiro() {
        return dinheiro;
    }

    public static void setDinheiro(double dinheiro) {
        Vendas.dinheiro = dinheiro;
    }

    public static void vender(ArrayList<Clientes> clientes, ArrayList<Produto> produto, ListarVendas listaV) throws Exception {

        try {

            double parcela = 0;

            System.out.println("-----------------------------------------");
            Scanner s9 = new Scanner(System.in);
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("Cpf's cadastrados: " + "\n" + clientes.get(i).getCpf());
            }
            System.out.println("-----------------------------------------");
            System.out.print("Insira o CPF do cliente que irá fazer a compra: ");
            String checkcpf = s9.next();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getCpf().equals(checkcpf)) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Produtos cadastrados: ");
                    for (int j = 0; j < produto.size(); j++) {
                        System.out.println(produto.get(j).getDescricao());
                    }
                    System.out.println("-----------------------------------------");
                    System.out.print("Insira o produto desejado: ");
                    String product = s9.next();
                    for (int j = 0; j < produto.size(); j++) {
                        if (produto.get(j).getDescricao().equals(product)) {
                            System.out.println("-----------------------------------------");
                            System.out.print("Quantidade: ");

                            int qtd = s9.nextInt();

                            if (produto.get(i).getQuantidade() < (qtd)) {
                                System.out.println("Desculpe, mas não temos essa quantidade.");

                            } else {
                                System.out.println("-----------------------------------------");
                                System.out.println("Formas de pagamento: \n 1. Crédito\n 2. Débito\n 3. Dinheiro");
                                System.out.println("-----------------------------------------");
                                System.out.print("Insira sua opção: ");
                                int op = s9.nextInt();

                                switch (op) {

                                    case 1:

                                        if (produto.get(i).getPreco() * (qtd) < 1000) {
                                            double total = produto.get(i).getPreco() * (qtd);
                                            System.out.println("-----------------------------------------");
                                            System.out.println("Para compras abaixo de 1000 reais, não temos opções de parcelas.");
                                            System.out.println("O total da compra resulta em " + total + " reais.");
                                            System.out.println("-----------------------------------------");
                                            System.out.println("1. Finalizar compra \n2. Voltar ao menu");
                                            System.out.print("Insira sua opção: ");
                                            int op1 = s9.nextInt();

                                            if (op1 == 1) {
                                                Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                listaV.addVendas(regVenda);
                                                credito += total;
                                                System.out.println("Compra finalizada!");
                                            }

                                            if (op1 == 2) {

                                            }
                                        }
                                        else {

                                            double total = produto.get(i).getPreco() * (qtd);
                                            double juros = 0.05;

                                            System.out.println("-----------------------------------------");
                                            System.out.println("Para compras com valor acima de 1000 reais, temos opções de parcelas!");
                                            System.out.println("Parcelas em até 5 vezes sem juros, acima de 5 parcelas há juros de 5%!");
                                            System.out.print("Deseja parcelar em quantas vezes? ");

                                            int parcelas = s9.nextInt();

                                            switch (parcelas) {

                                                case 1:

                                                    parcela = total;
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento a vista de: " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op1 = s9.nextInt();

                                                    if (op1 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += total;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op1 == 2) {

                                                    }

                                                    break;


                                                case 2:

                                                    parcela = total / 2;
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em duas parcelas de " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op2 = s9.nextInt();

                                                    if (op2 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += total;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op2 == 2) {

                                                    }

                                                    break;

                                                case 3:

                                                    parcela = total / 3;
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em três parcelas de " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op3 = s9.nextInt();

                                                    if (op3 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += total;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op3 == 2) {

                                                    }
                                                    break;

                                                case 4:

                                                    parcela = total / 4;
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em quatro parcelas de " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op4 = s9.nextInt();

                                                    if (op4 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += total;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op4 == 2) {

                                                    }
                                                    break;

                                                case 5:

                                                    parcela = total / 5;
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em cinco parcelas de " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op5 = s9.nextInt();

                                                    if (op5 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += total;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op5 == 2) {

                                                    }
                                                    break;

                                                case 6:

                                                    parcela = total * 0.05 / (1 - (Math.pow(1 + juros, -6)));
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em seis parcelas de: " + parcela);
                                                    parcela *= 6;
                                                    System.out.println("Total da compra se altera para: " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op6 = s9.nextInt();

                                                    if (op6 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += parcela;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op6 == 2) {

                                                    }
                                                    break;

                                                case 7:

                                                    parcela = total * 0.05 / (1 - (Math.pow(1 + juros, -7)));
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em sete parcelas de " + parcela);
                                                    parcela *= 7;
                                                    System.out.println("Total da compra se altera para: " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op7 = s9.nextInt();

                                                    if (op7 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += parcela;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op7 == 2) {

                                                    }
                                                    break;

                                                case 8:

                                                    parcela = total * 0.05 / (1 - Math.pow(1 + juros, -8));
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em oito parcelas de " + parcela);
                                                    parcela *= 8;
                                                    System.out.println("Total da compra se altera para: " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op8 = s9.nextInt();

                                                    if (op8 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += parcela;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op8 == 2) {

                                                    }
                                                    break;

                                                case 9:

                                                    parcela = total * 0.05 / (1 - (Math.pow(1 + juros, -9)));
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em nove parcelas de " + parcela);
                                                    parcela *= 9;
                                                    System.out.println("Total da compra se altera para: " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op9 = s9.nextInt();

                                                    if (op9 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += parcela;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op9 == 2) {

                                                    }

                                                    break;

                                                case 10:

                                                    parcela = total * 0.05 / (1 - (Math.pow(1 + juros, -10)));
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("Pagamento em dez parcelas de " + parcela);
                                                    parcela *= 10;
                                                    System.out.println("Total da compra se altera para: " + parcela);
                                                    System.out.println("-----------------------------------------");
                                                    System.out.println("1. Confirmar compra");
                                                    System.out.println("2. Voltar ao menu");
                                                    System.out.print("Insira sua opção: ");
                                                    int op10 = s9.nextInt();

                                                    if (op10 == 1) {
                                                        Vendas regVenda = new Vendas(checkcpf, product, qtd, "Crédito");
                                                        listaV.addVendas(regVenda);
                                                        credito += parcela;
                                                        System.out.println("Compra finalizada!");
                                                    }

                                                    if (op10 == 2) {

                                                    }
                                                    break;
                                            }
                                            credito += parcela;
                                        }
                                        break;

                                    case 2:

                                        double totaldb = produto.get(i).getPreco() * (qtd);
                                        System.out.println("-----------------------------");
                                        System.out.println("O total da compra resulta em " + totaldb + " reais.");
                                        System.out.println("-----------------------------");
                                        System.out.println("1. Finalizar compra \n2. Voltar ao menu");
                                        System.out.println("-----------------------------");
                                        System.out.print("Insira sua opção: ");
                                        int op1 = s9.nextInt();

                                        if (op1 == 1) {
                                            Vendas regVenda = new Vendas(checkcpf, product, qtd, "Débito");
                                            listaV.addVendas(regVenda);
                                            debito += totaldb;
                                            System.out.println("Compra finalizada!!");
                                            System.out.println("-----------------------------");
                                        }

                                        if (op1 == 2) {

                                        }

                                        break;

                                    case 3:

                                        double totald = produto.get(i).getPreco() * (qtd);
                                        System.out.println("-----------------------------");
                                        System.out.println("O total da compra resulta em " + totald + " reais.");
                                        System.out.println("-----------------------------");
                                        System.out.println("1. Finalizar compra \n2. Voltar ao menu");
                                        System.out.println("-----------------------------");
                                        System.out.print("Insira sua opção: ");
                                        int op2 = s9.nextInt();

                                        if (op2 == 1) {
                                            Vendas regVenda = new Vendas(checkcpf, product, qtd, "Dinheiro");
                                            listaV.addVendas(regVenda);
                                            dinheiro += totald;
                                            System.out.println("Compra finalizada!");
                                        }

                                        if (op2 == 2) {

                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Opção inválida!");
        }
    }
}