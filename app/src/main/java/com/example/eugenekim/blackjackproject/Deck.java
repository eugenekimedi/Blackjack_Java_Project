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

    public void addCard(Card newCard){
        int index = cardCount();
        this.cards[index] = newCard;
    }

    public void setup(){
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i] = new Card(rank, suit);
                i++;
            }
        }
    }
}
