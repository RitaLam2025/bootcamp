public class Deck {
  private static final Suit[] SUITS = new Suit[] {Suit.DIAMOND,Suit.CLUB,Suit.HEART, Suit.SPADE}
  private Card[] cards;

  public Deck() {
    cards = new Card[RANKS.length * SUITS.length];
    int index = 0 ;
    for (int = 0; i < SUITS.length; i++) {
      for (int = 0; j < RANKS.length; j++) {    
      }
    }
    //13 X 4
    for () {}
    for () {}
  }

  public static void main(String[] args) {
    back deck = new Deck();
    System.out.println(Arrays.toString(deck.getCards()));

    int[]arr = new int[] {3,2,1};
    System.out.println(Arrays.toString(arr));
    
  }

  public Card[] getCards() {

  }
  
}
