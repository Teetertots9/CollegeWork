/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author pmage_000
 */
public class Employee {
    private String name;
    private int numYearsService;
    private double salary;
    
    public Employee()
    {
        this.name="";
        this.numYearsService=0;
        this.salary=0.0;       
    }
    public Employee(String name,int num,double sal)
    {
        this.name=name;
        this.numYearsService=num;
        this.salary=sal;
    }
    public void print()
    {
        System.out.println("Employee:");
        System.out.println("\t" + "Name: " + name);
        System.out.println("\t"+"Years Service:" +numYearsService);
        System.out.printf("\t"+ "Salary: €%,.2f \n",salary);
    }
    
    
}
