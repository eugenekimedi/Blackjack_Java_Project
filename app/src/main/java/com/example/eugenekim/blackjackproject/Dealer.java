package com.example.eugenekim.blackjackproject;

/**
 * Created by eugenekim on 7/7/17.
 */

public class Dealer extends Player{
    private Deck deck;

    public Dealer(){
    }

    public void dealCard(Deck deck, Player player) {
        Card card = deck.getTop();
        player.receiveCard(card);
    }
}
