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
public class Volunteer extends StaffMember {

    public Volunteer(String name, String address, String phoneNo) {
        super(name, address, phoneNo);
    }

    @Override
    public double pay() {
        return 0;
    }
}
