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
public class Commission_Emp extends Employee {
    double sales ;

    public Commission_Emp(String name, String surname, double secu_num) {
        super(name, surname, secu_num);
        
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    

    @Override
    public Double Calc_Sal() {
        double sal ;
        sal = this.sales*0.1 ;
        return sal ;
    }
    
    
}
