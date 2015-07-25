package com.company;

/**
 * Created by Kevin on 15.7.17.
 */
public class Card {
    private String suit;
    private String rank;
    private int pointValue;

    public Card(String suit, String rank, int pointValue){
        this.suit = suit;
        this.rank = rank;
        this.pointValue = pointValue;
    }

    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    public int getPointValue() {
        return pointValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean equalSuit = this.suit.equals(((Card)obj).getSuit());
        boolean equalRank = this.rank.equals(((Card)obj).getRank());
        return equalRank && equalSuit;
    }
}
