/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table (name= "EMPLOYEE13EX1")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "type")

@SequenceGenerator (name="eid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="eid_seq")
    private int empid;
    private String name;
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    public Employee() {

    }

    public Employee(String name, Calendar c) {
        
        this.name = name;
        startDate = c;
    }

    public int getID() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public Calendar getStartDate() {
        return startDate;
    }
    
    public void setID(int id){
        this.empid = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setStartDate(Calendar c){
        startDate = c;
    }
    
    @Override
    public String toString() {
        return String.format(" Employee Id: %2d Name: %-10s "
                + "Start Date: %3$8td %3$tB %3$td   ",empid,name,startDate);
    }

}