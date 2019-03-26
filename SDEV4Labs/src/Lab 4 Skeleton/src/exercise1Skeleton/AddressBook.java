package exercise1Skeleton;

import java.util.*;
import java.io.*;

public class AddressBook {

    private String owner;
    private ArrayList<Contact> myList = new ArrayList<>();
    private static int totalContacts = 0;

    public AddressBook(String owner) {
        this.owner = owner;
    }

    public void fillList1() throws FileNotFoundException {
        File myDir = new File("files");
        File contacts = new File(myDir, "contacts.txt");
        String name;
        String mobile;
        char gender;
        String schar;

        try (Scanner in = new Scanner(contacts)) {
            while (in.hasNextLine()) {
                name = in.nextLine();
                schar = in.nextLine();
                gender = schar.charAt(0);
                mobile = in.nextLine();

                myList.add(new Contact(name, gender, mobile));
            }
        }
    }

    public void fillList2() throws FileNotFoundException, IOException {
        File myDir = new File("files");
        File contacts = new File(myDir, "contacts.txt");
        String s = null;
        String name;
        String mobile;
        char gender;
        String schar;

        try (BufferedReader in = new BufferedReader(new FileReader(contacts))) {
            while ((s = in.readLine()) != null) {
                name = s;
                schar = in.readLine();
                gender = schar.charAt(0);
                mobile = in.readLine();

                myList.add(new Contact(name, gender, mobile));

            }
        }
    }
    
    public void fillList3() throws FileNotFoundException, IOException {
        File myDir = new File("files");
        File contacts = new File(myDir, "contacts.txt");
        String name;
        String mobile;
        char gender;
        String schar;

        try (Scanner in = new Scanner(contacts)) {
            while (in.hasNextLine()) {
                name = in.nextLine();
                schar = in.nextLine();
                gender = schar.charAt(0);
                mobile = in.nextLine();

                myList.add(new Contact(name, gender, mobile));
            }
        }
    }

    public void printList() {
        for (int i = 0; i < myList.size(); i++) {
            myList.get(i).printContact();
        }

    }

    public int calcNumMales() {
        int numMales = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).gender == 'm') {
                numMales++;
            }
        }
        return numMales;
    }

    public String getName() {
        return owner;
    }

    public static int getTotalContacts() {
        return totalContacts;
    }

    class Contact {

        private String name;
        private char gender;
        private String mobile;

        public Contact(String name, char gender, String mobile) {
            this.name = name;
            this.mobile = mobile;
            this.gender = gender;
            totalContacts++;
        }

        public void printContact() {
            System.out.println(name + "," + gender + "," + mobile);
        }
    }
}
