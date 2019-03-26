/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassexercises;

/**
 *
 * @author x00139120
 */
public class University {
    private String uniName;
    private Department[] depList;
    
    public University(String uniName, int[] depIds, String[] depNames){
        this.uniName = uniName;
             depList = new Department[depIds.length];
             
             for (int i = 0; i < depList.length; i++) {
            depList[i] = new Department(depIds[i], depNames[i]);
        }
}
    public String getUName(){
        return uniName;
    }
    public void setUName(String name){
        uniName = name;
}
    public void showList(){
        for (int i = 0; i < depList.length; i++) {
            System.out.println(depList[i].getID()+ " " + depList[i].getName());
        }
    }
    public void changeDepName(String oldName, String newName){
        for (int i = 0; i < depList.length; i++) {
            if (depList[i].getName().equals(oldName)) {
                depList[i].setName(newName);
            }
        }
    }
}
