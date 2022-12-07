import java.util.Scanner;



public class TestArray6 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int[] items = new int[10];

      int total=0;

        

      System.out.println("Enter 10 numbers: ");

      for (int g = 0; g < items.length; g++) {

         items[g] = sc.nextInt();

         total+=items[g];

      }  

      System.out.println("\nTotal: " + total);

   

   }

}



//Programmer: Glenn Pizon

