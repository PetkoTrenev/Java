package blackjack;

/**
 * Created by Petko-PC on 4/19/2017.
 */
public class BlackJack {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffleDeck();

        for (PokerCard card : deck.getCards()) {
            System.out.println(card.getSuit() + " of " + card.getFaceValue());
        }
    }
}
