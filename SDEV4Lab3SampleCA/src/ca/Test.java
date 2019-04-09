/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        
    double highest = 0.0;
        String highName = "";

        List<Concert> cList = new ArrayList<>();

        openfile("drake.txt", cList);
        openfile("hughjackman.txt", cList);

        for (int j = 0; j < cList.size(); j++) {

            System.out.println("Concert " + (j + 1) + " performed by:" + cList.get(j).getPerformer());
            cList.get(j).printList();
            System.out.printf("The total sales for this concert is: €%,.2f%n",cList.get(j).calcTotalSales());
            if (cList.get(j).calcTotalSales() > highest) {
                highest = cList.get(j).calcTotalSales();
                highName = cList.get(j).getPerformer();
            }

        }
        

        System.out.printf("The highest sales of all 2 concerts is %s at €%,.2f%n",highName,highest);

        for (int k = 0; k < cList.size(); k++) {
            if (cList.get(k).calcTotalSales() <= 10000) {
                try {
                    throw new NotEnoughTicketsSold();
                } catch (NotEnoughTicketsSold ex) {
                    System.out.println(ex.getMessage()+cList.get(k).getPerformer());
                }
            }
        }
    }

    public static void openfile(String filename, List<Concert> cList) {

        File inFile = new File("files", filename);
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                String cName = in.nextLine();
                int capacity = Integer.parseInt(in.nextLine());
                String line = in.nextLine();
                cList.add(new Concert(cName, capacity));

                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    String type = lineScanner.next();
                    if (type.equals("se")) {
                        Concert.Ticket t = cList.get(cList.size() - 1).new Ticket(ConcertTicket.SEATED);
                        cList.get(cList.size() - 1).fillList(t);
                    } else {
                        Concert.Ticket t = cList.get(cList.size() - 1).new Ticket(ConcertTicket.STANDING);
                        cList.get(cList.size() - 1).fillList(t);
                    }

                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }
    }

}
