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
public abstract class Employee implements Employee_Manage {
    
     String name, surname ;
     double secu_num ;

    public Employee() {
    }
     
    public  Employee(String name, String surname, double secu_num) {
        this.name = name;
        this.surname = surname;
        this.secu_num = secu_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSecu_num() {
        return secu_num;
    }

    public void setSecu_num(double secu_num) {
        this.secu_num = secu_num;
    }
    
    
    
}
