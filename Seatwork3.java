public class Seatwork3 {
   public static void main(String[] args) {
   
      try {
      
      // code that generate exception
         int dividedByToZero = 10 / 0;
         System.out.println("");
      }
      
      catch (ArithmeticException e) {
         System.out.println("ArithmeticException is " + e.getMessage());
      }
      finally{
        
        
         System.out.println("ErrorFound !!!");
      }
   }
}