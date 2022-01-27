package br.com.classes;

public class director_Budget_Handler extends base_budget_handler {


    public customer_Budget Handler(customer_Budget budget) {
        if (budget.total < 50000 && budget.total > 4999) {
            System.out.println("sr(a) " + budget.getNome() +  " o Diretor cuidou do seu orçamento");
            budget.aprovado = true;
            return budget;
        } else {
            return super.Handler(budget);
        }
    }
}
