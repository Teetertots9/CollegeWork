/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab7;

/**
 *
 * @author x00139120
 */
public class TestDB {
    public static void main(String[] args) {
        ContactsDB cdb = new ContactsDB();
        cdb.openDB();
        cdb.dropTables();
        cdb.buildContactsTable();
        cdb.queryDB();
        cdb.insert();
        cdb.showDB();
        cdb.closeDB();
    }
}
