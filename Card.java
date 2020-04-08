import java.util.ArrayList;

public class Card
{
   // Fields
   private final Suits suit;
   private final Ranks rank;
   public boolean isFaceUp;
   
   // Constructor
   public Card(Suits suit, Ranks rank)
   {
      this.suit = suit;
      this.rank = rank;
   }
   
   // Methods
   public String getSuit()
   {
      return suit.printSuit();
   }
   
   public int getRank()
   {
      return rank.getRank();
   }
   
   public String printRank()
   {
      return rank.printRank(); // for Ace (1 or 11)
   }
   
   public void flipCard()
   {
      isFaceUp = !isFaceUp;
   }
   
   public String toString()
   {
      String str = " ";
      if(isFaceUp = true)
      {
         str += rank.printRank() + "" + suit.printSuit();
      }
      else
      {
         str = "[Face Down]";
      }
      return str;
   }
}