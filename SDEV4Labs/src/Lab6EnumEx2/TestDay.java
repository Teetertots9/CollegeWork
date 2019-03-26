/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6EnumEx2;

import java.util.List;

/**
 *
 * @author x00139120
 */
public class TestDay {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.valueOf("FRIDAY");

        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("Today's a weekend.");
        } else {
            System.out.println("Today's a weekday.");
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("The abbreviation for %s is %c \n",
                    day, day.letter());
        }

        for (Character c : "YMWFTRS".toCharArray()) {
            System.out.println(DayOfWeek.toDayOfWeek(c));
        }

         List<DayOfWeek> list = DayOfWeek.getDays();

        System.out.println(list.get(0) == DayOfWeek.values()[0]);
        System.out.println(DayOfWeek.MONDAY.next() == DayOfWeek.TUESDAY);
        System.out.println(today.next() == DayOfWeek.SATURDAY);
        System.out.println(DayOfWeek.SUNDAY.next() == DayOfWeek.MONDAY);
       

    }
}
