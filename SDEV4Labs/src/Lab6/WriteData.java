/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) {

        File myfile = new File("files", "dvdData.txt");
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(myfile)))){
        
           out.write("The Great Wall,Thriller,2017,3,2\n");
           out.write("John Wick Chapter 2,Action,2017,5,0\n");
           out.write("Logan,Action,2017,0,5\n");
           out.write("Loving,Drama,2017,4,1\n");
              
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        

    }

}
