/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inClassExerciseFriday;

/**
 *
 * @author x00139120
 */
public class TestStudent {
    public static void main(String[] args) {
        StudentDB db = new StudentDB();
        
        db.openDB();
        db.dropTables();
        db.buildStudentTable();
        db.showDB();
        db.insert(5,"Kim",50);
        db.showDB();
        db.closeDB();
    }
}
