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
    }

    @Test
    public void canCountValues(){
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, dealer);
        assertEquals(5, rules.countValues(player.getHand()));
        assertEquals(9, rules.countValues(dealer.getHand()));
    }

    @Test
    public void canCompareHandsPlayerWins(){
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, player);
        int dealerScore = rules.countValues(dealer.getHand());
        int playerScore = rules.countValues(player.getHand());
        assertEquals("player wins", rules.compareHands(playerScore, dealerScore));
    }

    @Test
    public void canCompareHandsDealerWins(){
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, dealer);
        int dealerScore = rules.countValues(dealer.getHand());
        int playerScore = rules.countValues(player.getHand());
        assertEquals("dealer wins", rules.compareHands(playerScore, dealerScore));
    }

    @Test
    public void canCompareHandsDraw(){
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, player);
        int dealerScore = rules.countValues(dealer.getHand());
        int playerScore = rules.countValues(player.getHand());
        assertEquals("draw", rules.compareHands(playerScore, dealerScore));
    }
}
