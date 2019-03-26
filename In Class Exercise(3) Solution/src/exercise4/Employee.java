package exercise4;

import java.util.Comparator;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;

    public Employee() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    public Employee(String l, String f, int a) {
        firstName = f;
        lastName = l;
        age = a;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\t" + "Last Name: "
                + lastName + "\t" + "Age:" + age;
    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>(){
        @Override
        public int compare(Employee o1, Employee o2) {

            return o1.getLastName().compareTo(o2.getLastName());

        }
    };
}
