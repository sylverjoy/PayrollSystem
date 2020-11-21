/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Sylver Yamsi
 */
public class Based_Salaried extends Commission_Emp {
    double base_sal ;
    
    public Based_Salaried(String name, String surname, double secu_num) {
        super(name, surname, secu_num);
        
    }

    public double getBase_sal() {
        return base_sal;
    }

    public void setBase_sal(double base_sal) {
        this.base_sal = base_sal;
    }

    @Override
    public double getSales() {
        return sales;
    }

    @Override
    public void setSales(double sales) {
        this.sales = sales;
    }
    
    
    @Override
    public Double Calc_Sal() {
        double sal ;
        sal = (this.sales*0.1)+this.base_sal;
        return sal ;
         
    }
    
    
    
    
}
