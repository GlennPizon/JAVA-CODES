import java.util.*;

public class NoArray{
   public static void main(String[] args){
      Scanner chrizon = new Scanner(System.in);
      double sumTotal = 0, difference = 0, product = 1, num = 0;
      double qoutient = 1.0, a = 1.0;double b = 0;
      int count = 0;
      int[] g = new int[0];         int christine [] = new int[10];
   
   
      System.out.println("OPERATION STIX!!!");
   
      System.out.println("Enter 10 numbers!");
   
      for(int i = 0; i < 10; i ++){
         System.out.printf("Numbers: ");
      
         christine [i] = chrizon.nextInt();
         if (num%2 == 0 ){
            sumTotal+=christine [i];
            difference -= christine [i];
            product*=christine [i];
            qoutient=christine [i]/a;
            a+=christine [i];
         
         }         
         
         else
         
         {
            sumTotal = 0;
            difference = 0;
            product = 0;
            qoutient = 0;
         }
      
      }
      System.out.print("Enter a number to search: ");
      b = chrizon.nextInt();
      for(int i=0;i<10;i++){
      
         if(christine[i] == b){
         
            count++;
         
         
         }            
      
      }
                   
      System.out.println("Total sum of even numbers: " + sumTotal);
      System.out.println("Difference of even numbers: " + difference);
      System.out.println("Product of even numbers: " + product);   
      System.out.println("Qoutient of even numbers: " + qoutient);
      System.out.println( "\nNumber " + b + " appeared " + count + " times." );
      
   
   }
}


