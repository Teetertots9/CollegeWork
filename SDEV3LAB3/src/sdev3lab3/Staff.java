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
public class Staff {

    private StaffMember[] staff;

    public Staff() {
        staff = new StaffMember[]{
            new Executive("John", "1 This St", "0874323476", "R6574635", 2423.07),
            new Employee("Paul", "2 Thas St", "0854345222", "P8884635", 1246.15),
            new Employee("Dave", "3 Other St", "0864343566", "S9876635", 1169.23),
            new Hourly("Joanne", "4 Long Ave.", "0836789676", "T0987635", 10.55),
            new Volunteer("Norma", "5 Short Ave.", "0864323456"),
            new Volunteer("Kate", "6 Pecks Lane", "0854676767"),
            new Commission("Molly", "7 Nowhere Rd.", "0864326789", "L6599635", 6.25, .2),
            new Commission("Joe", "8 My Place", "0864344545", "G8888635", 9.75, .15)};
    }

    public void processStaff() {
        for (StaffMember s : staff) {
            if (s.name.equals("John")) {
                ((Executive) s).awardBonus(500);
            }
            if (s.name.equals("Joanne")) {
                ((Hourly) s).addHours(50);
            }
            if (s.name.equals("Molly")) {
                ((Commission) s).addHours(55);
                ((Commission) s).addSales(400);
            }
            if (s.name.equals("Joe")) {
                ((Commission) s).addHours(45);
                ((Commission) s).addSales(950);
            }
        }
    }

    public void payday() {
        for (StaffMember s : staff) {
            System.out.println(s.toString() + " \nPay: " + s.pay());
            System.out.println("");
        }
    }
}

