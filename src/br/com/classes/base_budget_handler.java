package br.com.classes;

import java.util.logging.Handler;

public abstract class base_budget_handler {

    protected base_budget_handler nexthandler = null;


    public customer_Budget Handler(customer_Budget budget){
        if(budget.aprovado == false){
            return this.nexthandler.Handler(budget);
        }else {
            return budget;
        }
    }
    public base_budget_handler setNexthandler(base_budget_handler handler) {
        this.nexthandler = handler;
        return handler;
    }
}
