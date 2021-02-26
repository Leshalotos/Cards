package com.Cards;

import java.util.*;

public class Card implements Comparable<Card> {

    enum Suit {SPADES, CLUBS, DIAMOND, HEARTS};
    enum Face {DOUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINO, TEN, JACK, QUEEN, KING, ACE}
    private final Suit suit;
    private final Face face;

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    @Override
    public int compareTo(Card card) {
        Face[] values = Face.values();
        List<Face> faces = Arrays.asList(values);

        if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
            return -1;
        } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
            return 1;
        } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
        }
            return 0;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    public Suit getSuit() {
        return suit;
    }
    public Face getFace() {
        return face;
    }
}
