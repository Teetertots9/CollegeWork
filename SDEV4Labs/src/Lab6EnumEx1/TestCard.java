/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6EnumEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class TestCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noPlayers;      
        int cardsPerHand;
        
        
        System.out.println("Please enter the number of players in the game");
        noPlayers = in.nextInt();
        System.out.println("Please enter the number of cards per hand");
        cardsPerHand = in.nextInt();
        
        Deck deck = new Deck();
        deck.shuffle();
        
        for (int i = 0; i < noPlayers; i++) {
            System.out.println(deal(deck.getDeck(), cardsPerHand));
        }
    }
   
    public static List<Card> deal(List<Card> deck, int cardsPerHand){
        int sizeOfDeck = 52;
        List<Card> handView;
        List<Card> hand;
        handView = deck.subList(0, cardsPerHand - 1);
        hand = new ArrayList<>(handView);
        handView.clear();
        
        return hand;
    }
}
