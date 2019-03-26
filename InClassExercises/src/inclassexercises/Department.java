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
public class Department {
    private int depID;
    private String depName;
    
    public Department(int id, String name){
        depID = id;
        depName = name;
    }
    
    public int getID(){
        return depID;
    }
    public String getName(){
        return depName;
    }
    public void setID(int id){
        depID = id;
    }
    public void setName(String name){
        depName = name;
    }
}
