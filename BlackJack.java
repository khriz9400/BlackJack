import java.util.Collections;

public class BlackJack
{
   public static void main(String[] args)
   {
      // Create a deck
      Deck playingDeck = new Deck();
      playingDeck.populate();
      playingDeck.shuffle();
      
      // Create playing hand
      Hand player = new Hand();
      Hand dealer = new Hand();
      //Hand[] hands = {player}; if you wanted multiple players you list them out here
      
      // Deal Cards
      playingDeck.deal(player, 1);
      playingDeck.deal(dealer, 1);
      playingDeck.deal(player, 1);
      playingDeck.deal(dealer, 1);
      
      // Show hands
      /*for (int i = 0; i < hands.length; i++)
      {
         hands[i].flipCards();
         System.out.println(hands[i].showHand())l     for multiple players
      } */
      player.flipCards();
      System.out.println(player.showHand());
      
      // Flip dealers first card
      dealer.cards.get(0).flipCard();
      
      // Show Dealers cards
      System.out.println("Dealers's Cards: \n" + dealer.showHand());
      
      /* Card c1, c2;
      
      c1 = new Card(Suits.HEART, Ranks.ACE);
      c2 = new Card(Suits.HEART, Ranks.JACK);
      
      // Flip cards
      c1.flipCard();
      c2.flipCard();
      
      // Create a hand
      Hand h1 = new Hand();
      Hand h2 = new Hand();
      h1.add(c1);
      h1.add(c2);
      System.out.println(h1.showHand());
      h1.give(c1, h2);
      h1.clear();
      System.out.println("Hand 1 is: " + h1.showHand() + "\n" +
         "Hand 2 is now: " + h2.showHand());
      
      // Create a deck
      Deck d1 = new Deck();
      d1.populate();
      System.out.printf("Deck has the following cards;\n%s\n", d1.showHand());
      System.out.println();
      d1.shuffle();
      System.out.printf("Deck now has the following cards;\n%s\n", d1.showHand());
      
      */
      
   }
}