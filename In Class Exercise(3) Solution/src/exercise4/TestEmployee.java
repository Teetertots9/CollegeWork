/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> persons = new ArrayList<>();

        persons.add(new Employee("Donnell", "John", 34));
        persons.add(new Employee("Collins", "Tony", 18));
        persons.add(new Employee("Greally", "Jim ", 16));
        persons.add(new Employee("Brady", "Noel", 69));

        Collections.sort(persons, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        


        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

}
