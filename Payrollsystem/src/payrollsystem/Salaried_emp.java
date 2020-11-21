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
public class Salaried_emp extends Employee {
    
    double weekly_sal ;
    int weeks_w ;

    public Salaried_emp(String name, String surname, double secu_num) {
        super(name, surname, secu_num);
    }

    Salaried_emp() {
    }

    public double getWeekly_sal() {
        return weekly_sal;
    }

    public void setWeekly_sal(double weekly_sal) {
        this.weekly_sal = weekly_sal;
    }

    public void setWeeks_w(int weeks_w) {
        this.weeks_w = weeks_w;
    }
    

    @Override
    public Double Calc_Sal() {
        double sal ;
        sal = this.weekly_sal*this.weeks_w ;
        
        return sal ;
        
    }
    
    
    
}
