/*
 @ANDREW TEETERS 
  PARTNER WAS ABSENT FOR THIS LAB
 */
package sdev2lab9;



/**
 *
 * @author x00139120
 */
public class TestPackage {

    public static void main(String[] args) {
        //classes
        
        Package p1;
        InsuredPackage ip1;
        
        //Constructors
        p1 = new Package(32, 'T');
        ip1 = new InsuredPackage(32, 'T');
        
        //display methods
        p1.displayDetails();
        System.out.println("");
        ip1.displayDetails();
    }

}
