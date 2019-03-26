package model;

import java.util.Calendar;
import javax.persistence.*;

@Entity
@DiscriminatorValue("T")
@PrimaryKeyJoinColumn(referencedColumnName="EMPID")

@SuppressWarnings("SerializableClass")

public class Technician extends Employee {
    private String expertise;

    public Technician() {
    }

    public Technician(String name, Calendar startdate,String expertise) {
        super(name, startdate);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

@Override
    public String toString() {
        return String.format("%20s","Technician: ")+ super.toString()
                +String.format("Expertise: %15s",expertise);
    }

}
