/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassexercise;

import java.util.ArrayList;

/**
 *
 * @author x00139120
 */
public class University {

    private String uName;
    private ArrayList<Department> deptlist;

    public University(String name, int deptId[], String deptName[]) {
        uName = name;

        deptlist = new ArrayList<>();

        for (int i = 0; i < deptId.length; i++) {
            deptlist.add(new Department(deptId[i], deptName[i]));
        }
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void showList() {
        for (int i = 0; i < deptlist.size(); i++) {
            System.out.println(deptlist.get(i).getDeptid() + "," + deptlist.get(i).getDeptName());
        }
    }

    public void changedeptname(String old, String newname) {
        for (int i = 0; i < deptlist.size(); i++) {
            if (deptlist.get(i).getDeptName().equals(old)) {
                deptlist.get(i).setDeptName(newname);
            }
        }

    }


private class Department {

    private int deptid;
    private String deptName;

    public Department(int dept, String deptN) {
        this.deptid = dept;
        deptName = deptN;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
}
