/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;
import javax.persistence.*;

@Entity
@Table(name = "Contacts")
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contacts c"),

})
@SequenceGenerator(name="cid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
/**
 *
 * @author x00139120
 */
public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_seq")
    private int idNum;
    private String name;
    private String address;
    private String pNumber;
    private String eMail;
    
    public Contact(){
        
    }
    
    public int getID(){
        return idNum;
    }
    public void setID(int idNum){
        this.idNum = idNum;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPNumber(){
        return pNumber;
    }
    public void setPNumber(String pNumber){
        this.pNumber = pNumber;
    }
    public String getEMail(){
        return eMail;
    }
    public void setEMail(String eMail){
        this.eMail = eMail;
    }
}
