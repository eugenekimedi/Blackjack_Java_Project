package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by eugenekim on 7/7/17.
 */

public class PlayerTest {

    Player player;
    Card card;
    Card card1;
    Deck deck;

    @Before
    public void before() {
        player = new Player();
        card = new Card(Rank.ACE, Suit.SPADES);
        card1 = new Card(Rank.TWO, Suit.CLUBS);
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canReceiveCard() {
        player.receiveCard(card);
        player.receiveCard(card1);
        assertEquals(2, player.cardCount());
    }

    @Test
    public void canGetHand() {
        player.receiveCard(card);
        player.receiveCard(card1);
        Card[] expected = new Card[2];
        expected[0] = card;
        expected[1] = card1;
        assertArrayEquals(expected,  player.getHand());
    }
}
