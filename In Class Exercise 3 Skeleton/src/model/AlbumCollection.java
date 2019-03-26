package model;

import db.AlbumOperations;

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

    public void fillList() {

    }

    public void updateAlbum() {

    }

    public void removeAlbum(){
        
    }
    
    public void addAlbum(){
        
    }
    
}
