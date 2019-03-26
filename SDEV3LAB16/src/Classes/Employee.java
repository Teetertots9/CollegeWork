/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;

/**
 *
 * @author x00139120
 */
public abstract class Employee implements IPayable {

    private String fname;
    private String lname;
    private String rsiNumber;
    public static int numEmpProcessed = 0;
    public static double totalTaxPaid = 0;

    public Employee() {

    }

    public Employee(String fname, String lname, String rsi) {
        this.fname = fname;
        this.lname = lname;
        this.rsiNumber = rsi;
        numEmpProcessed++;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getRSINumber() {
        return rsiNumber;
    }

    public void setFname(String s) {
        this.fname = s;
    }

    public void setLname(String s) {
        this.lname = s;
    }

    public void setRSINumber(String s) {
        this.rsiNumber = s;
    }
}
