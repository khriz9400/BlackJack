import java.util.Collections;
import java.util.Random;

public class Deck extends Hand
{
   Random rand = new Random();
   
   public void populate()
   {
      for (Suits suit: Suits.values())
      {
         for (Ranks rank: Ranks.values())
         {
            Card card = new Card(suit, rank);
            card.flipCard();
            this.add(card);
         }
      }
   }
   
   public void shuffle()
   {
      Collections.shuffle(cards);
      /*for (int i = cards.size() - 1; i > 0; i--)
       *{
       *  int pick = rand.nextInt(i);
       *  Card randCard = cards.get(pick);
       *  Card lastCard = cards.get(i);
       *  cards.set(i, randCard);
       *  cards.set(pick, lastCard);
      }*/
   }
   // Deals to an array of players
   public void deal(Hand[] hands, int perHand)
   {
      for (int i = 0; i < perHand; i++)
      {
         for (int j = 0; j < hands.length; j++)
         {
            this.give(cards.get(0), hands[j]);
         }
      }
   }
   
   // Deal to a single hand
   public void deal(Hand hand, int perHand)
   {
      for (int i = 0; i < perHand; i++)
      {
         this.give(cards.get(0), hand);
      }
   }
   
   public void flipCard(Card c)
   {
      c.flipCard();
   }
}
