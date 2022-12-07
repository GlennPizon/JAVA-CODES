import java.util.*;

public class SumArray{
   public static void main(String[] args){
      int[] val = {0,1,2,3};
      int sum = 0;
      int result = val.length - 1;
      int[] display = new int[val];
      
      sum+=val[result];
      for(int c = 0; c < val.length; c++){
         display = val [c];
         
      }
         
      System.out.println("Sum of all numbers: " );
      System.out.println(sum);
      System.out.println(display);
   }
}