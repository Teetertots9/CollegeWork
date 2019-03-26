/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab3;

/**
 *
 * @author x00139120
 */
public abstract class StaffMember {

    protected String name;
    protected String address;
    protected String phoneNo;

    public StaffMember(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        String stringOut = ("Name: " + name + " \nAddress: " + address + " \nPhone Number: " + phoneNo);
        return stringOut;
    }

    public abstract double pay();
}
