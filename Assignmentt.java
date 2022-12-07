import java.util.*;

public class Assignmentt{
   
   
   public static void main(String[] args){
     
      double cc1Grade = 0, cc2Grade = 0, average=0;
      String a;
      Name();
      checkGrades();
      
                     
      
         
   }
   public static void Name(){
      Scanner sc = new Scanner(System.in);
      String name;
      System.out.print("WELCOME TO STUDENT PORTAL!");
               
      System.out.println("\nEnter your name: ");
      name = sc.nextLine();
   
    
   }
   public static void checkGrades(){
      Scanner sc = new Scanner(System.in);
      String name,a;
      
      double cc1Grade = 0, cc2Grade = 0, average=0;
   
      
      System.out.println("Enter your grade for CC1: ");
      cc1Grade = sc.nextInt();
      System.out.println("Enter your grade for CC2: ");
      cc2Grade = sc.nextInt();
      
      
      int average = ( cc1Grade + cc2Grade ) / 2;         
      if(average >= 75){
         System.out.println("PASSED");
      }
      if(average <= 74){
         System.out.println("FAILED");
      }
      
      
      if (cc1Grade >= 75 && cc2Grade >= 75){
         System.out.println("You are ready to graduate!");
         
      } 
      else {
         System.out.println("Please pass all the subjects");
      
      }
      
      

   
   }

}

