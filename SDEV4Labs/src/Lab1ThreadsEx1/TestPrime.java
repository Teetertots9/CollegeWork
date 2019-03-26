/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1ThreadsEx1;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class TestPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many threads do you wish to use(1-5)");
        int a = in.nextInt();
        Thread[] threads = new Thread[a];
        System.out.println("Creating " + threads.length + " prime counting threads");
        for (int i = 0; i < threads.length; i++) {
            CountPrimesThread count1 = new CountPrimesThread(i + 1);
            threads[i] = new Thread(count1);
        }
        System.out.println("Threads have been created and started");
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
