/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name= "EMPLOYEE14")
@Inheritance( strategy = InheritanceType.JOINED)
@DiscriminatorColumn( name = "type")

@SequenceGenerator (name="empid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="empid_seq")
    private int empid;
    private String name;
    @Temporal(TemporalType.DATE)
    private Calendar startDate;
    
    @OneToMany(mappedBy = "emp",cascade = CascadeType.ALL)  
    private List<Contact> clist = new ArrayList<>();

    public Employee() {

    }

    public Employee(String name, Calendar c) {
        
        this.name = name;
        startDate = c;
    }
    
    public void addContact(Contact c) {
        this.clist.add(c);
        c.setEmp(this);
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
    
    public List<Contact> getClist() {
        return clist;
    }
    
    @Override
    public String toString() {
        String s = "";
        s += "Employee " + "Id: " + empid + ", Name: " + name + ", Contacts: ";
        for (int i = 0; i < clist.size(); i++) {
            s += "\n" + clist.get(i) + "\n";
        }
        return s;
    }

}