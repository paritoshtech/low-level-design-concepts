package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;

public class TaxCalculatorFactory {


    public  static TaxCalculator CreateTaxCalculatorFactory(Employee employee)
    {
        TaxCalculator tc=null;
        if(employee instanceof FullTimeEmployee){
            tc= new FullTimeEmployeeTaxCalculator();
        }
        else if (employee instanceof PartTimeEmployee){
            tc= new PartTimeEmployeeTaxCalculator();
        }
        else if (employee instanceof Intern){
            tc= new InternTaxCalculator();

        }

        return tc;
    }
}
