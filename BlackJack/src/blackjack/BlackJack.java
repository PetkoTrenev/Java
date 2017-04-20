package blackjack;

import java.util.Scanner;

/**
 * Created by Petko-PC on 4/19/2017.
 */
public class BlackJack {
    public static void main(String[] args) {
        // creates a deck, full of cards
        Deck deck = new Deck();

        // shuffle the deck
        deck.shuffleDeck();

        Deck playerHand = new Deck();
        // clears all the cards in the playersDeck
        // meaning he has 0 cards at the start of the game
        playerHand.clear();
        Deck computerHand = new Deck();
        // clears all the cards in the playersDeck
        // meaning he has 0 cards at the start of the game
        computerHand.clear();

        // generate two cards for each player
        PokerCard card1 = deck.draw();
        playerHand.add(card1);
        PokerCard card2 = deck.draw();
        playerHand.add(card2);

        PokerCard card3 = deck.draw();
        computerHand.add(card3);
        PokerCard card4 = deck.draw();
        computerHand.add(card4);


        // Game logic
        boolean playerStayed = false;
        boolean computerStayed = false;

        while (!playerStayed || !computerStayed) {
            System.out.println("Your cards are (" + playerHand.totalValue() + "):");

            for (PokerCard card : playerHand.getCards())
            { // playerHand is not a collection, needs getCards() method
                System.out.println("\t" + card);
            }

            System.out.println("Computer cards are (" + computerHand.totalValue() + "):");
            System.out.println("\t{Face-Down}");

            for (int i = 1; i < computerHand.size(); i++)
            {
                System.out.println("\t" + computerHand.get(i));
            }

            if (!playerStayed)
            {
                System.out.println("Do you want to hit ?");
                Scanner sc = new Scanner(System.in);
                String response = sc.nextLine().toLowerCase();
                while (!(response.startsWith("y")) && !(response.startsWith("n"))) {
                    System.out.println("I don't understand. Do you want to hit ? (Y/N)");
                    response = sc.nextLine().toLowerCase();
                }
                if (response.startsWith("y")) {
                    PokerCard tempCard = deck.draw();
                    playerHand.add(tempCard);
                    if (playerHand.totalValue() > 21) {
                        // busted
                        playerStayed = true;
                    }
                } else {
                    playerStayed = true;
                }
            }
                // AI logic
                if (computerHand.totalValue() < 17) {
                    computerHand.add(deck.draw());
                }
                else {
                    computerStayed = true;
                }

                if (playerStayed && computerStayed) {
                    // find out who won
                    int playerValue = playerHand.totalValue();
                    int computerValue = computerHand.totalValue();

                    /**
                     * If player went over 21
                     */
                    if (playerValue > 21) {
                        if (computerValue > 21) {
                            // computer also busted
                            System.out.println("\nThe game was a tie.");
                        }
                        else {
                            System.out.println("\nYou lost.");
                        }
                    }

                    /**
                     * If player is not over.
                     */
                    else {
                        if ((computerValue > 21) || (playerValue > computerValue)) {
                            System.out.println("\nYou won!");
                        }
                        else if (computerValue > playerValue) {
                            System.out.println("\nYou lost.");
                        }
                        else if (computerValue == playerValue) {
                            System.out.println("\nThe game is a tie.");
                        }
                    }
                    System.out.println("\nPlayer's cards: (" + playerHand.totalValue() + "):");
                    for (PokerCard card : playerHand.getCards())
                    { // playerHand is not a collection, needs getCards() method
                        System.out.println("\t" + card);
                    }
                    // Runs whether win or lose
                    System.out.println("\n\nComputer's cards: (" + computerHand.totalValue() + "):");
                    for (PokerCard card : computerHand.getCards())
                    { // playerHand is not a collection, needs getCards() method
                        System.out.println("\t" + card);
                    }
                }
        }
    }
}
