/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Random;

/**
 *
 * @author x00139120
 */
public class MagicHat {

    private static int maxRabbits = 4;
    private static Random rand = new Random();
    private String hatName;
    private Rabbit[] rList;

    static class Rabbit {

        private static String[] rabbitNames = {"Joe", "Jack", "Fred", "Bunny"};
        private static int[] numbers = new int[rabbitNames.length];
        private String rName;

        public Rabbit() {
            int index = rand.nextInt(rabbitNames.length - 1);
            rName = rabbitNames[index] + (++numbers[index]);
        }

        @Override
        public String toString() {
            return rName;
        }
    }

    public MagicHat(String hatName) {
        this.hatName = hatName;
        int arraySize = 1 + rand.nextInt(maxRabbits);
        rList = new Rabbit[arraySize];
        for (int i = 0; i < rList.length; i++) {
            rList[i] = new Rabbit();
        }
    }

    @Override
    public String toString() {
        String s = hatName + " contains: \n";
        for (int i = 0; i < rList.length; i++) {
            s = s + " " + rList[i];
        }

        return s;
    }
}
