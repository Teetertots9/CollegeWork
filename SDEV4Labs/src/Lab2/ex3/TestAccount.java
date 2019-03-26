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
class TestAccount {

    public static void main(String[] arg) throws PositiveWithdrawalException{
        Account theAccount = new Account(200);
        try{
            theAccount.withdraw(-300);
        } catch (PositiveWithdrawalException e){
            System.out.println(e.getMessage());
        }
    }
}

