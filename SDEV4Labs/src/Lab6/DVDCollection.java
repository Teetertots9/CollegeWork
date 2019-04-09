package Lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class DVDCollection {
     private ArrayList<DVD> dvds = new ArrayList<>();

    public void addDVD(String title, String cat, int aYear, int quantity, int checkedOut) {
        dvds.add(new DVD(title, cat, aYear, quantity, checkedOut));
    }

    public void checkOutDVD(int num) {
        DVD d;

        if (dvds.get(num - 1).getQuantityInstock() > 0) {
            d = dvds.get(num - 1);
            d.checkOut();
        } else {
            try {
                throw new OutOfStockException();
            } catch (OutOfStockException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
    public boolean returnDVD(int num) {
        DVD d;

        d = dvds.get(num - 1);

        if (d.returnDVD()) {
            return true;
        } else {
            return false;
        }
    }

    public void rateDVD(int num, double rating) {
        DVD dvd = dvds.get(num - 1);
        dvd.rateDVD(rating);
    }

    public DVD mostPopular() {
        double maxRating = 0;
        DVD bestVideo = null;
        for (DVD dvd : dvds) {
            double rating = dvd.getAverageRating();
            if (rating > maxRating) {
                bestVideo = dvd;
                maxRating = rating;
            }
        }
        return bestVideo;
    }
    public void displayDVDList() {
        System.out.println("DVDs");
        for(int i=0;i<dvds.size();i++){  
            System.out.printf("DVD Number: %d Title: %-20s Number Available: %d%n",(i+1),dvds.get(i).getTitle(),
                    dvds.get(i).getQuantityInstock());
        }
    }

    public void writetoFile() {
        File myfile = new File("files", "dvdDataExtra.txt");
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(myfile)))) {
            String s = String.format("%-20s", "Title") + String.format("%-20s", "Category") 
                    + String.format("%15s", "Year")
                    + String.format("%15s", "Quantity") + String.format("%15s", "CheckedOut") 
                    + String.format("%15s", "Rating Sum") + String.format("%15s", "Rating Count");
            out.println(s);
            for (int i = 0; i < dvds.size(); i++) {
                out.println(dvds.get(i));
                out.println("Average rating for this dvd is: " + dvds.get(i).getAverageRating());
               
            }
             DVD d = mostPopular();
                out.println("Most popular dvd is: " + d.getTitle());
        } catch (IOException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }
    }
}
