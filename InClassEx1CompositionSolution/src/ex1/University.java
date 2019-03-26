package ex1;

public class University {

    private String uName;
    private Department deptlist[];

    public University(String uName, int deptId[], String deptName[]) {
        this.uName = uName;
        deptlist = new Department[deptId.length];
        for (int i = 0; i < deptlist.length; i++) {
            deptlist[i] = new Department(deptId[i], deptName[i]);
        }
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void showList() {
        for (int i = 0; i < deptlist.length; i++) {
            System.out.println(deptlist[i].getDeptid() + " "
                    + deptlist[i].getDeptName());
        }
    }

    public void changedeptname(String old, String newname) {
        for (int i = 0; i < deptlist.length; i++) {
            if (deptlist[i].getDeptName().equals(old)) {
                deptlist[i].setDeptName(newname);
            }
        }
    }
}
