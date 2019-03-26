/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inductionweekexercise;

/**
 *
 * @author x00139120
 */
public class Employee {
    private String name;
    private int years;
    private double salary;
    
    public Employee(){
        this.name = null;
        this.years = 0;
        this.salary = 0;
    }
    
    public Employee(String name, int years, double salary){
        this.name = name;
        this.years = years;
        this.salary = salary;
    }
    
    public void print(){
        System.out.println("Employee");
        System.out.printf("\tName: %s%n" , name);
        System.out.printf("\tYears Service: %s%n", years);
        System.out.printf("\tSalary: %s%n", salary);
    }
}
