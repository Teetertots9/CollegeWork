/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdevweek5lab1;

/**
 *
 * @author x00139120
 */
public class Book {

    private String isbn;
    private String name;
    private String author;
    private String edition;

    public Book(String iSBN, String nAME, String aUTHOR, String eDITION) {
        isbn = iSBN;
        name = nAME;
        author = aUTHOR;
        edition = eDITION;
    }

    public void setEdition(String newEdition) {
        edition = newEdition;
    }

    public String getName() {
        return name;
    }

    public String getEdition() {
        return edition;
    }
    public void print(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
    }
}
