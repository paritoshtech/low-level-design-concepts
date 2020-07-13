package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator  extends  TaxCalculator{
    private final int INCOME_TAX_PERCENTAGE = 15;

    public double calculate(Employee employee) {
        int monthlyIncome=employee.getMonthlyIncome();
        double tax=0;
        if(monthlyIncome>=(300000/12))
            tax=(employee.getMonthlyIncome() * (INCOME_TAX_PERCENTAGE)) / 100;
        return tax;


    }
}
