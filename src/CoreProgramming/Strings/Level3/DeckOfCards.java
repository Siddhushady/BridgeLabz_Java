package CoreProgramming.String.Level3;

/**
 * DeckOfCards class initializes, shuffles, and distributes a deck of cards using string arrays.
 * The program demonstrates string manipulation and array operations by creating methods to
 * initialize a standard 52-card deck (4 suits × 13 ranks), shuffle the deck using Fisher-Yates
 * algorithm, and distribute cards to multiple players. It displays each player's cards.
 */
public class DeckOfCards {

    /**
     * Initializes a standard deck of 52 cards.
     * @return Array of card strings (e.g., "Ace of Spades")
     */
    public static String[] initializeDeck() {

        // Array of card suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        // Array of card ranks
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        // Creating deck array: 4 suits × 13 ranks = 52 cards
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        // Nested loops to create all card combinations
        for (String suit : suits) {
            for (String rank : ranks) {
                // Creating card string: "rank of suit"
                deck[index++] = rank + " of " + suit;
            }
        }
        // Returning initialized deck
        return deck;
    }

    /**
     * Shuffles the deck using Fisher-Yates shuffle algorithm.
     * @param deck Array of cards to shuffle
     */
    public static void shuffleDeck(String[] deck) {

        // Loop to shuffle each position
        for (int i = 0; i < deck.length; i++) {
            // Generating random index from i to end of array
            int random = i + (int)(Math.random() * (deck.length - i));
            // Swapping card at position i with card at random position
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void main(String[] args) {

        // Calling method to initialize deck
        String[] deck = initializeDeck();
        // Calling method to shuffle deck
        shuffleDeck(deck);

        // Setting number of players
        int players = 4;
        // Setting number of cards per player
        int cardsPerPlayer = 9;

        // Loop to distribute cards to each player
        for (int i = 0; i < players; i++) {
            // Displaying player number
            System.out.println("\nPlayer " + (i + 1));
            // Loop to display cards for current player
            for (int j = 0; j < cardsPerPlayer; j++) {
                // Displaying card at calculated index (player offset + card index)
                System.out.println(deck[i * cardsPerPlayer + j]);
            }
        }
    }
}
