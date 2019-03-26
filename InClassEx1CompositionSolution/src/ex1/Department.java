package ex1;

public class Department {

    private int deptID;
    private String deptName;

    public Department() {
        this.deptID = 0;
        this.deptName = "";
    }
        

    public Department(int deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }

    public int getDeptid() {
        return deptID;
    }

    public void setDeptid(int deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

