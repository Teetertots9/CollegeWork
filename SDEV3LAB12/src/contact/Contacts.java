/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;


import javax.persistence.*;

@Entity
@NamedQueries({
@NamedQuery(name = "Contacts.findAll", query = "SELECT c FROM Contacts c"),
@NamedQuery(name = "Contacts.findContactbyId", query = "SELECT c FROM Contacts c WHERE  c.id <= :id")})

@SequenceGenerator(name="c_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
public class Contacts {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="c_seq")
    private int id;
    private String name;
    private String address;
    private String pnumber;
    private String email;
    
    public Contacts() {
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Contact: " + "Contact id: " + id + " Name: " + name + " Address: " + address + " Phone Number: " + pnumber + "Email: " +email;
    }
    
}
