package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public abstract class TaxCalculator {
    private  int INCOME_TAX_PERCENTAGE ;
    private  int PROFESSIONAL_TAX_PERCENTAGE ;


    public abstract double calculate(Employee employee) ;
}



