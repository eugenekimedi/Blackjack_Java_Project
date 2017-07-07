package com.example.eugenekim.blackjackproject;
import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Created by eugenekim on 7/7/17.
 */

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
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

    public void setup(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                this.cards.add(card);
            }
        }
    }

    public Card getTop() {
        return this.cards.get(0);
    }


}
