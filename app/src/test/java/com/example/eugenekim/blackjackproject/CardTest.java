package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by eugenekim on 7/7/17.
 */

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Rank.TWO, Suit.SPADES);
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.TWO, card.getRank());
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.SPADES, card.getSuit());
    }
}