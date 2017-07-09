package com.example.eugenekim.blackjackproject;

import java.util.HashMap;

/**
 * Created by eugenekim on 7/8/17.
 */

public class Rules {

    private HashMap<Enum, Integer> rules;

    public Rules() {
        rules = new HashMap<Enum, Integer>();
        rules.put(Rank.TWO, 2 );
        rules.put(Rank.THREE, 3 );
        rules.put(Rank.FOUR, 4 );
        rules.put(Rank.FIVE, 5 );
        rules.put(Rank.SIX, 6 );
        rules.put(Rank.SEVEN, 7 );
        rules.put(Rank.EIGHT, 8 );
        rules.put(Rank.NINE, 9 );
        rules.put(Rank.TEN, 10 );
        rules.put(Rank.JACK, 10 );
        rules.put(Rank.QUEEN, 10 );
        rules.put(Rank.KING, 10 );
        rules.put(Rank.ACE, 11 );
    }

    public int countValues(Card[] hand) {
        int points = 0;
        for (Card card : hand) {
            points += rules.get(card.getRank());
        }
        return points;
    }

    public String compareHands(int playerScore, int dealerScore){
        if (playerScore > dealerScore){
            return "player wins";
        }
        return "player loses";
    }
}
