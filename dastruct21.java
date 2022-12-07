import java.lang.Math;
public class dastruct21{

   public static int inValues(int how_many){
      int counter = 0;
      while(counter < how_many){
         System.out.print("*");
         counter++;
      }
      return how_many;
   }
   
   public static void inData(double x, double y){
   
      System.out.println("\nDouble a: " + x);
      System.out.println("Double b: " + y);
      
      inAcceptExponents(x,y);
      
      
   }
   
   public static double inAcceptExponents(double x, double y){
      
      double result = 0.0;
      result = Math.pow(x,y);
      System.out.println("\nThe power of " + x + " and " + y + " is " +  result);
      return result;
   }
   public static void main(String[] args){
   
      inValues(6);
      
      dastruct21 n = new dastruct21();
      n.inData(10,2);
      
    
   }

}

