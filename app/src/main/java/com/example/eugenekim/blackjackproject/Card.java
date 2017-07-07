package com.example.eugenekim.blackjackproject;

/**
 * Created by eugenekim on 7/7/17.
 */

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return this.rank;
    }
}
