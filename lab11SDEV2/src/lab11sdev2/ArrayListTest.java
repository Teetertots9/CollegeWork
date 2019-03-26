/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11sdev2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class ArrayListTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nameIn;
        boolean add;
        ArrayList<String> authors = new ArrayList<String>();
        authors.add("Craig Larman");
        authors.add("Perdita Stevens");
        authors.add("Len Bass");
        authors.add("Rob Bennett");
        authors.add("Rose Stevens");
        authors.add("Tom Manns");
        
        print(authors);
        
        System.out.print("Please enter authors name: ");
        nameIn = in.nextLine();
        System.out.println("");
        if (authors.contains(nameIn) == true) {
            System.out.println("Name is in the array list"); 
            
        }
        else if (authors.contains(nameIn) == false){
            System.out.print("Name is not in list, would you like to add it to the list, true/false: ");
            add = in.nextBoolean();
            if ( add == true) {
                authors.add(nameIn);
            }
        }
        System.out.println("");
        authors.set(authors.indexOf("Tom Manns"), "Tomas Mann");
        
        print(authors);
        
        System.out.println(numR(authors));

        
        

    }

    public static void print(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("" + a.get(i));
        }
        System.out.println("");
    }
    public static int numR(ArrayList<String> a){
        int noR = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).charAt(0) == 'R' || a.get(i).charAt(0) == 'r'){
             noR++;   
            }
        }
        return noR;
    }
}
