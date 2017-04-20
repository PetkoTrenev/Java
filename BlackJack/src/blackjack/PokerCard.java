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

    public String toString() {
        StringBuilder result = new StringBuilder();

        switch (faceValue) {
            case 1:
                result.append("Ace");
                break;
            case 2:
                result.append("Two");
                break;
            case 3:
                result.append("Three");
                break;
            case 4:
                result.append("Four");
                break;
            case 5:
                result.append("Five");
                break;
            case 6:
                result.append("Six");
                break;
            case 7:
                result.append("Seven");
                break;
            case 8:
                result.append("Eight");
                break;
            case 9:
                result.append("Nine");
                break;
            case 10:
                result.append("Ten");
                break;
            case 11:
                result.append("Jack");
                break;
            case 12:
                result.append("Queen");
                break;
            case 13:
                result.append("King");
                break;
            default:
                result.append("Unknown");
                break;
        }

        switch (suit) {
            case 0:
                result.append(" of Spades");
                break;
            case 1:
                result.append(" of Hearths");
                break;
            case 2:
                result.append(" of Diamonds");
                break;
            case 3:
                result.append(" of Clubs");
                break;
            default :
                result.append("Unkown");
                break;
        }

        return result.toString();
    }
}
