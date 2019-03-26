package model;

import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE2")
@DiscriminatorValue( value="PM" )

@SuppressWarnings("SerializableClass")
public class ProjectManager extends Employee {

    @Column(name="cproject")
    private String currentProject;

    public ProjectManager()
    {
        
    }
    public ProjectManager(String name, Calendar startdate,String currentProject) {
        super(name, startdate);
        this.currentProject = currentProject;
    }

    public String getCurrentProject() {
        return currentProject;

    }
    public void setCurrentProject(String currentProject) {

        this.currentProject = currentProject;

    }
    
    @Override
    public String toString() {

        return String.format("%20s","Project Manager: ")+ super.toString()
                +String.format("Current Project: %15s",currentProject);

    }


}
