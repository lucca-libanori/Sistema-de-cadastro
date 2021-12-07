package com.company;


import java.util.ArrayList;

public class FechamentodoDia {

    double totalDinheiro = 0;
    double totalDebito = 0;
    double totalCredito = 0;


    public void fechaDia(ArrayList<Vendas> vendas) {

        for (int i = 0; i < vendas.size(); i++) {
            totalDinheiro = Vendas.getDinheiro();
            totalDebito = Vendas.getDebito();
            totalCredito = Vendas.getCredito();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.format("O total de lucro do dia em débito foi de: %f \n",totalDebito);
        System.out.format("O total de lucro do dia em dinheiro foi de: %f \n",totalDinheiro);
        System.out.format("O total de lucro do dia foi de: %f \n",totalDebito + totalDinheiro);
        System.out.println("-------------------------------------------------------------");

    }
}
