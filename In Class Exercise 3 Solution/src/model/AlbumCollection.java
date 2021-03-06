package model;

import db.AlbumOperations;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumCollection {

    private String owner;
    private ArrayList<Album> aList;
    private AlbumOperations ao;

    public AlbumCollection() {
        this.owner = "";
        aList = new ArrayList<>();
    }

    public AlbumCollection(String name, AlbumOperations ao) {
        this.owner = name;
        this.ao = ao;
        aList = new ArrayList<>();

    }

    public void fillList() {
        ResultSet rset = ao.getAlbums();
        try {
            while (rset.next()) {
                Album a = new Album(rset.getInt(1), rset.getString(2),
                        rset.getString(3), rset.getDouble(4));
                aList.add(a);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showAlbums() {
        for (int i = 0; i < aList.size(); i++) {
            System.out.printf("%-5d %-20s %-30s %7.2f%n", aList.get(i).getId(), aList.get(i).getTitle(), aList.get(i).getArtist(), aList.get(i).getPrice());
        }
    }

    public boolean findAlbum(int id) {
        boolean found = false;
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i).getId() == id) {
                found = true;
            }
        }
        return found;
    }

    public void updateAlbum(int id, double newPrice) {
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i).getId() == id) {
                 aList.get(i).setPrice(newPrice);
                 ao.updateRecord(id, newPrice);
            }
        }    
    }

    public void removeAlbum(int id) {
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i).getId() == id) {
                aList.remove(i);
                ao.deleteRecord(id);
            }
        }    
        

    }

    public void addAlbum() {
        ResultSet rset = ao.getMaxAlbum();

        try {
            if (rset.next()) {
                Album a = new Album(rset.getInt(1), rset.getString(2),
                        rset.getString(3), rset.getDouble(4));
                aList.add(a);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
