package lab7;

import java.util.*;

public class DeckOfCards {
    private List<String> deck;
    private Random random;

    public DeckOfCards() {
        deck = new ArrayList<>();
        random = new Random();
        initializeDeck();
    }

    // Initialize the deck with 52 cards (standard deck)
    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds"};
        String[] values = {"Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + " of " + suit);
            }
        }
        shuffleDeck();
    }

    // Shuffle the deck
    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    // Synchronized method to deal a card to a player
    public synchronized String dealCard() {
        if (deck.isEmpty()) {
            return "No more cards to deal!";
        }
        return deck.remove(deck.size() - 1); // Deal the top card
    }

    // Check if the deck is empty
    public synchronized boolean isDeckEmpty() {
        return deck.isEmpty();
    }
}
