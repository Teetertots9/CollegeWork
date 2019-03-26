package model;

import db.ContactOperations;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddressBook {

    private String owner;
    private ArrayList<Contact> clist;
    private ResultSet rset;
    private ContactOperations co;

    public AddressBook(String o, ContactOperations co) {
        this.co = co;
        owner = o;
        clist = new ArrayList<>();
    }

    public void fillList() {
        rset = co.getContacts();
        Contact c;
        try {
            while (rset.next()) {
                c = new Contact(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5));
                clist.add(c);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR In FillList() Method: " + ex.getMessage());
        }
    }

    public void updateContact(int id, String newNumber) {
        int contactID = findContact(id);
        clist.get(contactID).setPhoneNumber(newNumber);
        co.updateRecord(contactID, newNumber);

    }

    public void removeContact(int id) {
        int contactID = findContact(id);
        clist.remove(contactID);
        co.deleteRecord(id);
    }

    public void addContact() {
        rset = co.getMaxContact();
        try{
            if (rset.next()) {
               Contact c = new Contact(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5));
               clist.add(c);
            }
        }catch (SQLException ex) {
            System.out.println("Error in addContact() method" + ex.getMessage());
        }
    }

    public int findContact(int id) {
        int returnID = -1;
        for (int i = 0; i < clist.size(); i++) {
            if (id == clist.get(i).getID()) {
                returnID = i;
            }
        }
        return returnID;
    }

    public Contact getContact(int i) {
        return clist.get(i);
    }

    public String getOwner() {
        return owner;
    }

    public int getNumContacts() {
        return clist.size();
    }

    public void showContacts() {
        for (int i = 0; i < clist.size(); i++) {
            System.out.printf("%-2d %-10s %-30s %-15s%-15s\n",
                    clist.get(i).getID(), clist.get(i).getName(),
                    clist.get(i).getAddress(),
                    clist.get(i).getPhoneNumber(),
                    clist.get(i).getEmail());
        }
    }
}
