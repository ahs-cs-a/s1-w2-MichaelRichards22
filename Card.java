public class Card {
    private int rank;
    private int suit;

    public Card (int r, int s) {
        rank = r;
        suit = s;
    }

    public int getRank () {
        return rank;
    }

    public int getSuit () {
        return suit;
    }

    public void setRank (int r) {
        rank = r;
    }

    public void setSuit (int s) {
        suit = s;
    }
}
