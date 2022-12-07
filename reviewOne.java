import java.util.Scanner;

public class reviewOne {

    

   public static void main(String[] args){  
   
         
   
      Scanner sc = new Scanner(System.in);  
   
      System.out.print("Enter a String: ");  
   
      String str= sc.nextLine();
   
      int num = 0;
   
           
   
      for(int g= 0; g < str.length(); g++){
      
         if(str.charAt(g) >= 48 && str.charAt(g) <= 57){ 
         
            num ++ ; }
      
            
      
      }
   
      System.out.println("Number of numbers: " + num);  
   
         
   
   }

   

}

   

   

        //Programmer: Glenn E. Pizon