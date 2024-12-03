package lab7;

import java.util.*;

public class Player extends Thread {
    private DeckOfCards deck;
    private String name;
    private List<String> hand;

    public Player(DeckOfCards deck, String name) {
        this.deck = deck;
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCardToHand(String card) {
        hand.add(card);
    }

    public void displayHand() {
        System.out.println(name + "'s hand: " + hand);
    }

    @Override
    public void run() {
        displayHand();
    }
}


