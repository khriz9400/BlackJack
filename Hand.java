import java.util.ArrayList;

public class Hand
{
   // Field
   public ArrayList<Card> cards; // had to make this public for shuffle to work
   
   // Constructor
   public Hand()
   {
      cards = new ArrayList<Card>();
   }
   
   // Methods
   public void clear()
   {
      cards.clear();
   }
   
   public void add(Card card)
   {
      cards.add(card);
   }
   
   public String showHand()
   {
      /* Show cards and their totals, but only shows total
       * points if all cards are face up */
      String str = "";
      boolean allFaceUp = true;
      for (Card c: cards)
      {
         str += c.toString() + "\n";
         if (!c.isFaceUp)
         {
            allFaceUp = false;
         }
      }
      // If all cards are face up, show total
      if(allFaceUp)
      {
         str += "Ttal points = " + getTotal() +"\n";
      }
      return str;
   }
   
   public void flipCards()
   {
      for (Card c: cards)
      {
         c.flipCard();
      }
   }
   
   public boolean give(Card card, Hand otherHand)
   {
      if(!cards.contains(card))
      {
         return false;
      }
      else
      {
         cards.remove(card);
         otherHand.add(card);
         return true;
      }
   }
   
   // Total Points
   public int getTotal()
   {
      int totalPoints = 0;
      boolean hasAce = false;
      
      for (int i = 0; i < cards.size(); i++)
      {
         totalPoints += cards.get(i).getRank();
         if (cards.get(i).printRank() == "A")
         {
            hasAce = true;
         }
         if (hasAce && totalPoints <= 11)
         {
            totalPoints += 10;
         }
      }
      
      return totalPoints;
   }
}