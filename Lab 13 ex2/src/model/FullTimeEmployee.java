/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.*;
import java.util.Calendar;

/**
 *
 * @author X00144631
 */

@Entity
@DiscriminatorValue( value = "FT" )
@PrimaryKeyJoinColumn(referencedColumnName="empid")
@SuppressWarnings("SerializableClass")



public class FullTimeEmployee extends Employee {
    
    private double salary;

    public FullTimeEmployee(String name, Calendar startDate, double salary) {
        super(name, startDate);
        this.salary = salary;
    }

    public FullTimeEmployee() {
        this.salary = 0.0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
 public String toString() {
        return super.toString()+ "  FullTimeEmployee " + "Salary: " + salary;
    }

   
    
    
    
    
}
