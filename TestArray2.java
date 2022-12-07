import java.util.Scanner;

public class TestArray2{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] items = new int[10];
      int evenSum = 0;
      int total = 0;
      int oddSum=0;
      
      System.out.println("Enter 10 numbers: ");
      for(int g=0;g<items.length;g++){
         items[g] = sc.nextInt();
         total+=items[g];
         if(g % 2 == 0)
         
            evenSum = evenSum + items[g];
         else if(g % 2 !=0)
            oddSum = oddSum + items[g]; 
      	
      }
      
      
      System.out.println("\nTotal: " + total);
      System.out.println("Sum of even numbers: " + evenSum);
      System.out.println("Sum of odd numbers: " + oddSum);         
   }
}