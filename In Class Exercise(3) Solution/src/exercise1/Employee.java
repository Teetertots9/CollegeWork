package exercise1;

public class Employee implements Comparable<Employee>{

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

    @Override
    public int compareTo(Employee e) {
        return e.age - this.age;
    }

}
