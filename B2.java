import java.util.*;
public class B2{
   public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      int occ = 0;
      System.out.print("Enter n: ");
      int n = scan.nextInt();
      int[] survey = new int[n];
      System.out.println("Enter elements: ");
      for(int i = 0; i<survey.length;i++){
         survey[i] = scan.nextInt();  
      }
      System.out.print("Enter y: ");
      int a = scan.nextInt();
      for(int i = 0; i<survey.length;i++){
         if(survey[i] == a){
            occ++;
         } 
      }
      System.out.print("FREQUENCY: "+occ);
   }
}