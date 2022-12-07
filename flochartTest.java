import java.util.*;

public class flochartTest{
   public static void main(String[] args) {
      Scanner a = new Scanner (System.in);
      int i = 0,sum=0,sumEven=0, sumOdd = 0;
      System.out.println("Enter 10 numbers: ");
      do{
         int num = a.nextInt();
         if(num % 2 == 0){
            sumEven += num;
         }
         else {
            sumOdd+=num;
         
         }
         
         i++;
         sum+=num;
      }
      while(i < 10);
      
      
      System.out.println("Sum of even number: " + sumEven);
      System.out.println("Sum of odd numbers: " + sumOdd);
      System.out.println("Sum of all numbers: " + sum);
   
   
   }

}