/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author X00144631
 */
@Entity
@DiscriminatorValue("PT")
@PrimaryKeyJoinColumn(referencedColumnName = "empid")
@SuppressWarnings ("SerializableClass")

public class PartTimeEmployee extends Employee{
    
    private double hours;
    private double rate;

    public PartTimeEmployee(String name, Calendar startDate, double rate, double hours) {
        super(name, startDate);
        this.hours = hours;
        this.rate = rate;
    }
    
      public PartTimeEmployee() {
        this.hours = 0;
        this.rate = 0;
    }
    
    
public String toString() {
        return super.toString() + "  PartTimeEmployee hours: " + hours + ", Rate: " + rate;
    }

    
}
