package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import com.example.eugenekim.blackjackproject.Player.*;

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
        dealer = new Dealer();
        player = new Player();
        deck = new Deck();
        deck.setup();
    }
//
//    @Test
//    public void canCountValues(){
//
//        dealer.dealCard(deck, player);
//        assertEquals(5, rules.countValues(player.getHand()));
//    }
}
