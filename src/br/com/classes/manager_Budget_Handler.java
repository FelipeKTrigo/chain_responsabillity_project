package br.com.classes;

public class manager_Budget_Handler extends base_budget_handler{

    public customer_Budget Handler(customer_Budget budget) {
        if (budget.total < 5000 && budget.total > 999) {
            System.out.println("sr(a)." + budget.getNome() +  " o gerente cuidou do seu orçamento");
            budget.aprovado = true;
            return budget;
        } else {
            return super.Handler(budget);
        }
    }
}
