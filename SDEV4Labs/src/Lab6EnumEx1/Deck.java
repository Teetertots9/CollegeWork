/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6EnumEx1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author x00139120
 */
public class Deck {
    
    public static List<Card> deckOfCards = new ArrayList<Card>();
    
    public Deck(){
        createDeck();
    }
    public List<Card> getDeck(){
        return deckOfCards;
    }
    public static List<Card> createDeck(){
        for (Suit s: Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(r,s);
                deckOfCards.add(c);
            }
        }
        return deckOfCards;
    }
    public void shuffle(){
        Collections.shuffle(deckOfCards);              
    }
}
