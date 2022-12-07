import java.util.*;

public class Assignment{

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String name;
      double cc1Grade = 0, cc2Grade = 0, average=0;
      
      System.out.print("WELCOME TO STUDENT PORTAL!");
               
      System.out.println("\nEnter your name: ");
      name = sc.nextLine();
      System.out.println("Enter your grade for CC1: ");
      cc1Grade = sc.nextInt();
      System.out.println("Enter your grade for CC2: ");
      cc2Grade = sc.nextInt();
      
      System.out.println("====================================================================");
      reportCard();         
      
         
   }

   public static void reportCard(){
         
      double cc1Grade = 0, cc2Grade = 0, average=0;
      String name;
      average = ( cc1Grade + cc2Grade ) / 2;
      
      System.out.println("Hi, " + name);
      
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

