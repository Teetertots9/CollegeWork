/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author x00139120
 */
public class AddressBook {

    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    private String owner;
    static int numContacts;
    private ArrayList<Contact> contacts = new ArrayList<>();

    private class Contact {

        String name;
        char gender;
        String mobile;

        public Contact(String name, char gender, String mobile) {
            this.name = name;
            this.gender = gender;
            this.mobile = mobile;
            AddressBook.numContacts++;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public String getMobile() {
            return mobile;
        }
    }

    public AddressBook(String owner) {
        this.owner = owner;
    }

    public void fillList() {
        int num;
        String name;
        char gender;
        String mobile;
        num = 1 + rand.nextInt(2);
        for (int i = 0; i < num; i++) {
            System.out.println("Enter name of Contact " + (i + 1));
            name = in.nextLine();
            System.out.println("Enter gender of Contact " + (i + 1));
            gender = in.nextLine().charAt(0);
            System.out.println("Enter the mobile of Contact " + (i + 1));
            mobile = in.nextLine();
            AddressBook.Contact c = new AddressBook.Contact(name, gender, mobile);
            contacts.add(c);
        }
    }

    public String getName() {
        return owner;
    }

    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).getName() + ", " + contacts.get(i).getGender() + ", " + contacts.get(i).getMobile());
        }
    }

    public int getMale() {
        int numMale = 0;
        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getGender() == 'm'){
                numMale++;
            }
            else if (contacts.get(i).getGender() == 'M'){
                numMale++;
            }
        }
        return numMale;
    }

    public static int getNumContacts() {
        return numContacts;
    }
}
