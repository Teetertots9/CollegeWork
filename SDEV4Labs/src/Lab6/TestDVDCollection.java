package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDVDCollection {
    public static void main(String[] args) {

        String name = null, type = null;
        int yr = 0, qty = 0, loaned = 0;

        DVDCollection d = new DVDCollection();
        File inFile = new File("files", "dvdData.txt");
        int i=0;
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    i++;
                    name = lineScanner.next();
                    type = lineScanner.next();
                    yr = Integer.parseInt(lineScanner.next());
                    qty = Integer.parseInt(lineScanner.next());
                    loaned = Integer.parseInt(lineScanner.next());
                }
                d.addDVD(name, type, yr, qty, loaned);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }

        while (true) {
            System.out.println("Please press 1 to rent a dvd");
            System.out.println("Please press 2 if you want to return a dvd");
            System.out.println("Please press 3 to save details to file");
            System.out.println("Press 4 to quit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    d.displayDVDList();
                    System.out.println("Enter the number of the DVD you wish to rent?");
                    int num = in.nextInt();
                    d.checkOutDVD(num);
                    d.displayDVDList();
                    break;
                case 2:
                    d.displayDVDList();
                    System.out.println("Enter the number of DVD you wish to return?");
                    num = in.nextInt();
                    if (d.returnDVD(num)) {
                        System.out.println("What rating would you give this DVD between 1 and 5");
                        double rating = in.nextDouble();
                        d.rateDVD(num, rating);
                        d.displayDVDList();
                    }
                    break;
                case 3:
                    d.writetoFile();

                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
