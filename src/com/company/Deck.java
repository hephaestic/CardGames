package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Kevin on 15.7.17.
 */
public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();
    private int size;

    public Deck(String[] suits, String[] ranks, int[] values) {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(new Card(suits[j], ranks[i], values[i]));
            }
        }
        size = deck.size();
        shuffle();
    }

    @Override
    public String toString() {
        String str = "";
        for(Card c : deck)
            str += c + "\n";
        return str;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public Card deal(){
        if(isEmpty()){
            return null;
        }
        return deck.get(size-- - 1);
    }

    public void shuffle(){
        Random rand = new Random();
        Card temp;
        for(int i = 0; i < deck.size(); i++){
            int j = rand.nextInt(deck.size() - i) + i;
            Collections.swap(deck, i, j);
        }
        size = deck.size();
    }
}
