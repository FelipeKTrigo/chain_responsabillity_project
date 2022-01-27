package br.com.main;

import br.com.classes.*;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        base_budget_handler seller = new seller_Budget_Handler();
        seller
                .setNexthandler(new manager_Budget_Handler())
                .setNexthandler(new director_Budget_Handler())
                .setNexthandler(new CEO_Budget_Handler());


        Scanner sc = new Scanner(System.in);
        System.out.println("por favor digite seu nome :");
        String nome = sc.next();
        System.out.println("informe o seu orçamento :");
        int orcam = sc.nextInt();
        customer_Budget customer_budget = new customer_Budget(orcam);
        customer_budget.setNome(nome);
        seller.Handler(customer_budget);

        System.out.println(customer_budget);

    }
}
