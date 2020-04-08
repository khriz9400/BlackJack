public enum Suits 
{
   CLUB("♣"), 
   DIAMOND("♦"),
   HEART("♥"), 
   SPADE("♠");
   
   private final String suitText;
   
   // Constructor
   private Suits(String suitText)
   {
      this.suitText = suitText;
   }
   
   // Public Method
   public String printSuit()
   {
      return suitText;
   }
}

                                                                                