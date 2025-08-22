public class CardMain {
    public static void main(String[] args) {
        Card c1 = new Card(7, 3);
        Card c2 = new Card(2, 0);
        Card c3 = new Card(11, 2);

        System.out.println(c1.getSuit());
        System.out.println(c2.getSuit());
        System.out.println(c3.getRank());

        c2.setSuit(1);
        System.out.println("Edit: " + c2.getSuit());
    }
}
