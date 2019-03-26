/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;
    import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timeWorked;
        int timeLeft, timeStarted;
        double overTimePay;
        final double TIMEANDAHALF = 1.5;
        final double BASEPAY = 10;
        final int BASE = 800;
        int overTime;
        double payEarned;
        
        System.out.println("Please enter the time you started at, in 0000 time");
            timeStarted = in.nextInt();
            
        System.out.println("Please enter the time you left at, in 0000 time");    
            timeLeft = in.nextInt();
            
            timeWorked= timeLeft - timeStarted;
            timeWorked = timeWorked - 100;
            overTime = timeWorked - BASE;
            overTimePay = overTime * (BASEPAY*TIMEANDAHALF);
            
        if (timeWorked > BASE)
        {
            payEarned = overTimePay + (BASE * BASEPAY);
            System.out.println("You worked: " + timeWorked);
            System.out.println("You Earned " + payEarned/100);
        }
        else if(timeWorked < 0)
        {
            System.out.println("Incorrect TimeEntered");
        }
        else if(timeWorked < BASE)
        {
            payEarned = timeWorked * BASEPAY;
            System.out.println("You worked: " + timeWorked);
            System.out.println("You Earned " + payEarned/100);
        }
        
        
        
        
        
        
    }
}
