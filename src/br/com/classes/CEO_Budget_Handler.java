package br.com.classes;

public class CEO_Budget_Handler extends base_budget_handler {


    public customer_Budget Handler(customer_Budget budget) {
            System.out.println("sr(a)." + budget.getNome() +  " o CEO cuidou do seu orçamento");
            budget.aprovado = true;
            return budget;
    }
}
