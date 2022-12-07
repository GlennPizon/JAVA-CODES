import java.util.Scanner;
public class Javaexcercise {
 
   public static void main(String[] args)  
   {  
      Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
      System.out.print("Enter a String: ");  
      String str= sc.nextLine();              //reads string   
      int num = 0;
        
      for(int i= 0; i < str.length(); i++){
         if(str.charAt(i) >= 48 && str.charAt(i) <= 57) 
            num ++ ;
      }
      System.out.println("Number of numbers: " + num);
        
   }
}