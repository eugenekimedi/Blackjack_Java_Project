package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by eugenekim on 7/8/17.
 */

public class RulesTest {
    Player player;
    Dealer dealer;
    Deck deck;
    Rules rules;

    @Before
    public void before() {
        rules = new Rules();
        dealer = new Dealer();
        player = new Player();
        deck = new Deck();
        deck.setup();
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, dealer);
    }

    @Test
    public void canCountValues(){
        assertEquals(5, rules.countValues(player.getHand()));
        assertEquals(9, rules.countValues(dealer.getHand()));
    }

    @Test
    public void canCompareHands(){

    }
}
