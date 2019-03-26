/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Calendar;
import javax.persistence.*;

@Entity
@DiscriminatorValue("PT")
@PrimaryKeyJoinColumn(referencedColumnName= "empid")

@SuppressWarnings("SerializableClass")

public class PartTimeEmployee extends Employee{

    private double hours, rate;
    
    public PartTimeEmployee(){
        
    }
    
    public PartTimeEmployee(String name, Calendar c, double hours, double rate){
        super(name,c);
        this.hours = hours;
        this.rate = rate;
    }
    
    public double getHours(){
        return hours;
    }
    
    public double getRate(){
        return rate;
    }
    
    public void setHours(double hours){
        this.hours = hours;
    }
    
    public void setRate(double rate){
        this.rate = rate;
    }
    
    @Override
    public String toString() {
        return super.toString() + "  PartTimeEmployee hours: " + hours + ", Rate: " + rate;
    }

}
