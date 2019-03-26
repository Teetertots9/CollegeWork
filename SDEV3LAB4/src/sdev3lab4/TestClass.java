/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab4;
import java.util.ArrayList;
import java.util.Scanner;
import static sdev3lab4.AddressBook.getNumContacts;
/**
 *
 * @author Dell User
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<AddressBook> books = new ArrayList<>();
        String owner;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name for the owner of Address book " + (i+1));
            owner = in.nextLine();
            
            AddressBook a = new AddressBook(owner);
            books.add(a);
            books.get(i).fillList();
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Owner: " + books.get(i).getName());
            books.get(i).printContacts();
            System.out.println("Number of Male friends: " + books.get(i).getMale());
        }
        System.out.println("Total Number of Contacts in all books: " + getNumContacts());
    }
}
