public class Card {
  private char rank;
  private char suit

  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }
  public char getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  // ! override false --> true
  @Override
  public boolean equals(Object obj) {
    //part 1: check address first,
    if(this ==obj)
    return true;
    //part 2: check if Card Object
    if(!(obj instanceof Card))  // ! = unequal
    return false;
    //part 3:
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  @Override
  public String toString() { // let ppl call after written, c1 is address 
    return "Card("
    + "rank=" + this.rank
    + ",suit=" + this.suit
    + ")";


    // ACE Diamond vs King Diamond --> 1
    // King Diamond vs ACE Diamond --> 1
    public int compareTo(Card card) {
      if (this.rank == card.getRank()) { // write from small region first, ==
        if 
        if (compareTo)
      }
      return 1;
      // rank
      // Spade > Heart > Club --> Diamond
    }
    public static int compareTo(char suit1, char suit2) {
    }

    public static void main(String[] args) {
      Card c1 = new Card('A', DIAMOND)
    }

    public static void main(String[] args)
    //! Override false --> true 

  }
}
