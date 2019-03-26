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
public class Musician extends Person {

    private String instrument;

    public Musician(String name, String instrument) {
        super(name);
        this.instrument = instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        String stringOut = (getName() + " plays " + getInstrument());
        return stringOut;
    }
}
