/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1ThreadsEx2;

/**
 *
 * @author x00139120
 */
public class CountPrimesThread implements Runnable{
    private int id;
    
    public CountPrimesThread(int id) {
        this.id = id;
    }
    
    public static boolean isPrime(int x) {
        int top = (int) Math.sqrt(x);
        
        for (int i = 2; i <= top; i++) {
             if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int countPrimes(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if(isPrime(i) == true){
                count++;
            }
        }
        return count;
    }
    
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int count = countPrimes(2,20000);
        long finishTime = System.currentTimeMillis();
        long elapsedTime = finishTime - startTime;
        System.out.println("Thread " + id + " counted " + count + " primes in " + elapsedTime + " milliseconds");
    }
}
