package com.company;

/**
 * Created by Kevin on 15.7.18.
 */
public class Board {
    private int numPlayers;
    private int cardsPerHand;
    private Card[][] cards;
    private Deck deck;

    public Board(int numPlayers, int cardsPerHand, String[] suits, String[] ranks, int[] values){
        cards = new Card[cardsPerHand][numPlayers];
        deck = new Deck(suits, ranks, values);
        dealBoard();
    }

    public void newGame(){
        deck.shuffle();
        dealBoard();
    }

    public int size(){
        return cards.length * cards[0].length;
    }

    public boolean isEmpty(){
        for(int i = 0; i < cards.length; i++){
            if(cards[i] != null)
                return false;
        }
        return true;
    }

    public int deckSize(){
        return deck.size();
    }

    public Card cardAt(int player, int pos){
        return cards[pos][player];
    }

    public void dealBoard(){
        for(int i = 0; i < cardsPerHand; i++){
            for(int j = 0; j < numPlayers; j++){
                cards[i][j] = deck.deal();
            }
        }
    }
}
