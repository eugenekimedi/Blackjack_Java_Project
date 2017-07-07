package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by eugenekim on 7/7/17.
 */

public class DealerTest {
    Player player;
    Deck deck;
    Dealer dealer;

    @Before
    public void before() {
        player = new Player();
        deck = new Deck();
        dealer = new Dealer();
    }

    @Test
    public void canDealCard() {
        deck.setup();
        dealer.dealCard(deck, player);
        assertEquals(51, deck.cardCount());
        assertEquals(1, player.cardCount());
    }
}
