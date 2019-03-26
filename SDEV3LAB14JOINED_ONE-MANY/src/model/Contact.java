/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.*;

@Entity
@Table(name = "CONTACT")

@SequenceGenerator(name="cid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
/**
 *
 * @author x00139120
 */
public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_seq")
    private int cid;
    private String name;
    private String address;
    private String phone;
    private String email;
    
    @ManyToOne()
    @JoinColumn(name = "empid")
    private int empid;
    
    public Contact(){
        
    }
    
    public Contact(String name, String address, String phone, String email, int empid){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.empid = empid;
    }
    
    public int getCId(){
        return cid;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getEmpId(){
        return empid;
    }
    
    public void setCId(int cid){
        this.cid = cid;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setEmpId(int empid){
        this.empid = empid;
    }
}
