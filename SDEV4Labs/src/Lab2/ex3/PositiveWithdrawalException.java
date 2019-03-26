/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.ex3;

/**
 *
 * @author x00139120
 */
public class PositiveWithdrawalException extends Exception{
    public PositiveWithdrawalException(){
        super("Withdrawal amount must be positive");
    }
}
