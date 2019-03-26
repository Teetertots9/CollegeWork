package model;

import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table (name= "EMPLOYEE2")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type" )

@SequenceGenerator(name="eid_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="eid_seq")
    private int id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    public Employee() {
    }
    
    public Employee(String name, Calendar startdate) {
        this.name = name;
        this.startDate = startdate;
    }

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return String.format(" Employee Id: %2d Name: %-10s "
                + "Start Date: %3$8td %3$tB %3$td   ",id,name,startDate);
    }
}
