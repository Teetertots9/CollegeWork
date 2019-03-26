/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.*;
import java.util.*;

/**
 *
 * @author X00144631
 */
@Entity
@Table (name= "Employee13EX2")
@Inheritance (strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
@SequenceGenerator(name="eid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")

public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="eid_seq")
    private int empid;
    private String name;
   @Temporal(TemporalType.DATE)
    private Calendar startDate;

    public Employee(String name, Calendar startDate) {
        this.name = name;
        this.startDate = startDate;
    }
    
    
     public Employee() {
        this.empid = 0;
        this.name = null;
        this.startDate = null;
    }

    public int getId() {
        return empid;
    }

    public void setId(int id) {
        this.empid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }
     
     
    public String toString() {
        return String.format(" Employee Id: %2d Name: %-10s "
                + "Start Date: %3$8td %3$tB %3$tY   ",empid,name,startDate);
    }


    
}
