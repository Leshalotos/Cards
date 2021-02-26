package com.Cards;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	List<Card> deckOfCards = new ArrayList<Card>();
	for (Card.Face face : Card.Face.values()) {
	    for (Card.Suit suit : Card.Suit.values()) {
	        deckOfCards.add(new Card(suit, face));
        }
    }
	System.out.println("Original deck of cards:");
	for (int i=0; i<deckOfCards.size(); i++) {
	    System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n" : " ");
    }
    }

}
