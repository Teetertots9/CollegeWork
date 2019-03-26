package exercise1Skeleton;


import java.util.Scanner;
import java.io.*;

public class TestAddressBook {

    public static void main(String args[])  {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("Enter the owner of address book");
        name = in.nextLine();

        AddressBook a = new AddressBook(name);
        /*try{
            a.fillList1();
        
        System.out.println("Address Book belongs to: " + a.getName());
        a.printList();
        System.out.println("Number of male friends are:" + a.calcNumMales());

        System.out.println("Total Contacts:" + AddressBook.getTotalContacts());
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        */    
        /*try{
            a.fillList2();
        
        System.out.println("Address Book belongs to: " + a.getName());
        a.printList();
        System.out.println("Number of male friends are:" + a.calcNumMales());

        System.out.println("Total Contacts:" + AddressBook.getTotalContacts());
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        */
        try{
            a.fillList3();
        
        System.out.println("Address Book belongs to: " + a.getName());
        a.printList();
        System.out.println("Number of male friends are: " + a.calcNumMales());

        System.out.println("Total Contacts: " + AddressBook.getTotalContacts());
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
