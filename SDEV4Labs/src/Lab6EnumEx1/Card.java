/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6EnumEx1;

/**
 *
 * @author x00139120
 */
public class Card {
     
     private Rank rank;
     private Suit suit;
     
     public Card(Rank rank, Suit suit){
         this.rank = rank;
         this.suit = suit;
     }
     
     @Override
     public String toString(){
         return rank +" of " + suit;
     }
}

