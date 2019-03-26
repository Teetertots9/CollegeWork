/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdevweek5lab1;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class TestBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bookIN, isbnIN, authorIN, editionIN;

        System.out.println("Please enter the isbn of the first book");
        isbnIN = in.nextLine();
        System.out.println("Please enter the name of the first book");
        bookIN = in.nextLine();
        System.out.println("Please enter the author of the first book");
        authorIN = in.nextLine();
        System.out.println("Please enter the edition of the first book");
        editionIN = in.nextLine();

        Book book1 = new Book(isbnIN, bookIN, authorIN, editionIN);

        System.out.println("Please enter the isbn of the second book");
        isbnIN = in.nextLine();
        System.out.println("Please enter the name of the second book");
        bookIN = in.nextLine();
        System.out.println("Please enter the author of the second book");
        authorIN = in.nextLine();
        System.out.println("Please enter the edition of the second book");
        editionIN = in.nextLine();

        Book book2 = new Book(isbnIN, bookIN, authorIN, editionIN);

        book1.print();
        System.out.println("");
        book2.print();
        System.out.println("");

        System.out.println("Please enter the new edition of the book " + (book1.getName()));
        editionIN = in.nextLine();
        book1.setEdition(editionIN);
        
        System.out.println("");
        book1.print();
        System.out.println("");
        book2.print();
        System.out.println("");

    }
}
