/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
    import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        final double DAY_S_M = 15.00, DAY_L_M = 25.00, END_S_M = 30.00, END_L_M = 35.00, ADD_D_S = 2.50, ADD_D_L = 3.50, ADD_E_S = 7.50, ADD_E_L = 8.50;
        final int FEE_HOURS = 3;
        
        String type, day;
        int hours, extraHours;
        double fee = 0;
        
        System.out.println("Enter mopette type(50cc or 250cc)");
            type = in.nextLine();
        System.out.println("Enter which part of the week rented (weekend or weekday)");
            day = in.nextLine();
        System.out.println("Enter the amount of hours used (number greater than zero)");
            hours = in.nextInt();
            extraHours = hours - FEE_HOURS;
            
        if (type.equals("50cc")){
            if(day.equals("weekday")){
                 fee = DAY_S_M;      
                 if (extraHours > 0 ){
                    fee = fee + (extraHours * ADD_D_S);
                                     }
                                     }
            else if(day.equals("weekend")){
                 fee = END_S_M;
                 if (extraHours > 0){
                     fee = fee + (extraHours * ADD_E_S);
                                     }
                 else{
                     fee = 0.00;
                     day = "Invalid Day";
                     System.out.println("Invalid day entered");
                                     }
                                     }
                                     }
        else if (type.endsWith("250cc")){
            if(day.equals("weekday")){
                 fee = DAY_L_M;      
                 if (extraHours > 0 ){
                    fee = fee + (extraHours * ADD_D_L);
                                     }
                                     }
            else if(day.equals("weekend")){
                 fee = END_L_M;
                 if (extraHours > 0){
                     fee = fee + (extraHours * ADD_E_L);
                                     }
                                     }
            else{
                 fee = 0.00;
                 day = "Invalid Day";
                 System.out.println("Invalid Day entered");
                                     }   
                                     }
        
        else{
            fee = 0.00;
            type = "Invalid Moped";       
            System.out.println("invalid moped type entered");
        }       
        System.out.printf("your fee is %.2f, the type of moped is %s, your time of the week is %s, and you have used the moped for %d hours ", fee, type, day, hours );                
     
}
}