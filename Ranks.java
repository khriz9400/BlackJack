public enum Ranks
{
   ACE(1, "A"), TWO(2, "2"), THREE(3, "3"),FOUR(4, "4"),
   FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"),
   NINE(9, "9"), TEN(10, "10"), JACK(10, "J"), QUEEN(10, "Q"), KING(10, "K");
   
   // Fields
   private final int rankValue;
   private final String rankString;
   
   // Constructor
   private Ranks(int rankValue, String rankString)
   {
      this.rankValue = rankValue;
      this.rankString = rankString;
   }
   
   // Method
   public int getRank()
   {
      return rankValue;
   }
   
   public String printRank()
   {
      return rankString;
   }
}

