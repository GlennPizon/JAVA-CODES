import java.util.*;  // Import ang Scanner

public class Practical1{            // Mao ni ang class
      
   public static void main(String[] args){           // Kini ang main method
      
      Scanner payns = new Scanner(System.in);     // Nagbuhat ug variable para magamit ang Scanner
      double ej[] = new double[10];         // Syntax sa pag-initialize sa usa ka array.
            
      System.out.println("Enter 10 numbers: ");    // Output ang question or problem
            
            
            
            //Mogamit ug loop. Para makainput tag kadaghan.
      for(int i=0;i <10;i++){       // For Loop CONDITION                               
            
         System.out.print("Number" + "[" +  ( i + 1) + "]" +" "); // For Loop Body                         
         ej [i] = payns.nextDouble();       // Input some decimal or double
            
          
      }
            
            
      System.out.println("Enter a number to search: ");
      double penaranda = payns.nextDouble();
      int count = 0;
            
      for(int i=0;i <10;i++){       // For Loop CONDITION                               
         if(ej[i] == penaranda){
            
            count++;
            
         }
            
      }
            
      System.out.println("Number of Occurence: " + count);
            
            
   }
            
}
      
      
