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
public class Contact {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_seq")
    private int cid;
    private String cname;         
    private String address;
    private String phone;  
    private String email;
    
    @ManyToOne()
    @JoinColumn(name = "empid")
    private Employee emp;

    public Contact() {

    }

    public Contact(String cname, String address, String phone, String email) {
        this.cname = cname;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return cid;
    }

    public void setId(int id) {
        this.cid = id;
    }

    public String getName() {
        return cname;
    }

    public void setName(String name) {
        this.cname = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee e) {
        this.emp = e;
    }

    @Override
    public String toString() {
        return String.format("Name: %10s Contact ID: %2d Address: %-15s "
                + "Phone Number: %15s Email: %10s Employee ID: %2d ",cname,cid,address,phone,email,emp.getID());
    }
}