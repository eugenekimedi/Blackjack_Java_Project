package com.example.eugenekim.blackjackproject;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by eugenekim on 7/7/17.
 */

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(Rank.TWO, Suit.CLUBS);
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCard() {
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }
}
