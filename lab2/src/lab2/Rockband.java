/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author x00139120
 */
public class Rockband {

    private String bandName;
    private String label;
    Musician[] members;

    public Rockband(String bandName, String label, String[] names, String[] instruments) {
        this.bandName = bandName;
        this.label = label;
        members = new Musician[names.length];
        for (int i = 0; i < names.length; i++) {
            members[i] = new Musician(names[i], instruments[i]);
        }
    }

    public boolean changeRecordLabel(String label) {
        if (this.label.equals(label)) {
            return false;
        } else {
            this.label = label;
            return true;
        }
    }

    public String getBandName() {
        return bandName;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        String stringOut = ("Rock Band: \n\tName: " + getBandName() + "\n\tRecord Company: " + getLabel());
        for (int i = 0; i < members.length; i++) {
            stringOut += ("\n\t\t" + members[i].toString());
        }
        return stringOut;
    }
}
