/* Create a function named computeAverage that accepts two parameters double midterm, double tentFinal 
   and returns the create myGrade with the same parameters. 
   
   
   Create a function named myGrade and invokes myGrade.
   
   
   Create a main method and calls the function computeAverage.
   Display pass if and fail.
   
   Let the user input the 2 parameters.
*/
import java.util.*;


class Grade{
   
   public static double computeAverage(double midterm, double tentFinal){
      
      double result = (midterm+tentFinal)/2;
      
      return result;
   
      
   }
   
  
   
   public static void main(String[] args){
      double result = 0.0;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter midterm grade: ");
      double midterm = s.nextDouble();
      System.out.print("Enter tentative final grade: ");
      double tentFinal = s.nextDouble();
      
      double grade = computeAverage(midterm,tentFinal);
      System.out.println("\nYour Midterm grade: "+midterm+ "\nYour Tentative Final grade: "+tentFinal);
      System.out.print("Your FINAL GRADE: " + grade);
      if(grade>=3.0)
         System.out.print("\nYou had tried your best but it did not worked out!, YOU FAILED!");
      else{
         System.out.print("\nYour efforts had been successfully seen, YOU PASSED!");
      }
      
   }
         
         
}

