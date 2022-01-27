package br.com.classes;

import com.sun.tools.jconsole.JConsoleContext;

public class seller_Budget_Handler extends base_budget_handler{


    public customer_Budget Handler(customer_Budget budget){
       if(budget.total < 1000 && budget.total > 0){
           System.out.println("sr(a)." + budget.getNome() +  " o vendedor cuidou do seu orçamento");
           budget.aprovado = true ;
           return budget;
       }else {
           return super.Handler(budget);
       }
        //if(this.nexthandler != null){
          //  return this.nexthandler.Handler(budget);
        //}else {
          //  return budget;
        //}
    }
}
