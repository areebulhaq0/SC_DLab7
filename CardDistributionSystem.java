package lab7;

public class CardDistributionSystem {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        
        // Create players
        Player player1 = new Player(deck, "Player 1");
        Player player2 = new Player(deck, "Player 2");
        Player player3 = new Player(deck, "Player 3");
        Player player4 = new Player(deck, "Player 4");

        // Distribute cards (13 cards each player)
        for (int i = 0; i < 2; i++) {
            player1.addCardToHand(deck.dealCard());  // Deal card to Player 1
            player2.addCardToHand(deck.dealCard());  // Deal card to Player 2
            player3.addCardToHand(deck.dealCard());  // Deal card to Player 3
            player4.addCardToHand(deck.dealCard());  // Deal card to Player 4
        }

        // Start the threads to display the hands
        player1.start();
        player2.start();
        player3.start();
        player4.start();
    }
}
