package com.example.eugenekim.blackjackproject;

/**
 * Created by eugenekim on 7/7/17.
 */

public class Player {

    private Card[] hand;

    public Player() {
        this.hand = new Card[2];
    }

    public int cardCount() {
        int numberOfCards = 0;

        for(Card card : this.hand) {
            if (card != null) {
                numberOfCards++;
            }
        }
        return numberOfCards;
    }

    public void receiveCard(Card newCard) {
        int index = cardCount();
        this.hand[index] = newCard;
    }

    public Card[] getHand(){
        return this.hand;
    }
}
