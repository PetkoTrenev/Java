package blackjack;

/**
 * Created by Petko-PC on 4/19/2017.
 */
public class PokerCard {
    private int suit;
    private int faceValue;

    public PokerCard() {}

    public PokerCard(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }


}
