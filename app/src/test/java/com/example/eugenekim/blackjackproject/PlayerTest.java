package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by eugenekim on 7/7/17.
 */

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before() {
        player = new Player();
        card = new Card(Rank.ACE, Suit.SPADES);
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canReceiveCard() {
        player.receiveCard(card);
        assertEquals(1, player.cardCount());
    }
}
