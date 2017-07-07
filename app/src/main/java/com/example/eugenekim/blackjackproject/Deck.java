package com.example.eugenekim.blackjackproject;

/**
 * Created by eugenekim on 7/7/17.
 */

public class Deck {

    private Card[] cards;

    public Deck() {
        this.cards = new Card[52];
    }

    public int cardCount() {
        int numberOfCards = 0;

        for(Card card : this.cards) {
            if (card != null) {
                numberOfCards++;
            }
        }
        return numberOfCards;
    }
}
