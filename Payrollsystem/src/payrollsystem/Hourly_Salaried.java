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
public class Hourly_Salaried extends Employee {
     
    double hourly_sal ;
    int hours_w ;

    public Hourly_Salaried(String name, String surname, double secu_num) {
        super(name, surname, secu_num);
    }

    public double getHourly_sal() {
        return hourly_sal;
    }

    public void setHourly_sal(double hourly_sal) {
        this.hourly_sal = hourly_sal;
    }

    public void setHours_w(int hours_w) {
        this.hours_w = hours_w;
    }
    

    @Override
    public Double Calc_Sal() {
        double sal ;
        if (this.hours_w > 40){
        sal = this.hourly_sal*40 +(this.hourly_sal*(this.hours_w-40)*1.5) ;
        }else 
        {
           sal = this.hourly_sal*this.hours_w ; 
        } 
        return sal;
    }
    
    
    
}
