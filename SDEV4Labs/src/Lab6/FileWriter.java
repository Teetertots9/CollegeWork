/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.io.*;
/**
 *
 * @author x00139120
 */
public class FileWriter {
    
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        int c = 3; 
        
        File myDir = new File("files");
        File outFile = new File(myDir, "dvd.txt");
        
        try(BufferedWriter bWriter = new BufferedWriter
            (new FileWriter((outFile)))) {
            
            bWriter.write(Integer.toString(a));
            bWriter.write(Integer.toString(b));
            bWriter.write(Integer.toString(c));
        } catch (IOException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }
    }
}
