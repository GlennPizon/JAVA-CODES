import java.util.Scanner;
public class Messenger {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      String welcome = "WELCOME TO STUDENT PORTAL!";
      System.out.println(welcome);
        
      Scanner n = new Scanner (System.in);
      System.out.println("Enter your name: ");
      String name = n.next();
        
      Scanner CC1 = new Scanner (System.in);
      System.out.println("Enter your grade for CC1: ");
      double cc1 = CC1.nextDouble();
        
      Scanner CC2 = new Scanner (System.in);
      System.out.println("Enter your grade for CC2: ");
      double cc2 = CC2.nextDouble();
      double average = (cc1 + cc2) / 2;

      if (average <= 74 && cc2 <= 74) {
         System.out.println("Please pass all subjects to graduate");
      }else 
         System.out.println("You are ready to graduate!");
        
      System.out.println("==============================");
        
      System.out.println("Hi, " + name + "!");
        
      String card = "Here's your report card: ";
      System.out.println(card);
        
      System.out.println("CC1: " + cc1);
        
      System.out.println("CC2: " + cc2);
        
      System.out.println("Average: " + average);
        
      String status = (average >= 75) ? "Passed" : "Failed";
      System.out.println("Status :" + status);
        
      if (average <= 74) {
         System.out.println("Please pass all subjects to graduate");
      }else 
         System.out.println("You are ready to graduate!");
   }
}