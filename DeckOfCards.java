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

    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public synchronized String dealCard() {
        if (deck.isEmpty()) {
            return "No more cards to deal!";
        }
        return deck.remove(deck.size() - 1);
    }

    // Check if the deck is empty
    public synchronized boolean isDeckEmpty() {
        return deck.isEmpty();
    }
}
