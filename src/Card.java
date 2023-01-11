public class Card {
   private Suit suit;
   private Rank rank;

   public Card(Suit suit, Rank rank) {
      this.suit = suit;
      this.rank = rank;
   }

   public String toString() {
      return rank + " of " + suit;
   }

   public boolean isRed() {
      return (suit == Suit.HEARTS || suit == Suit.DIAMONDS);
   }
}
