import java.util.*;

public class Balance{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      String c ="Yes";
      String d ="No";
      String e =" ";
      int numbers = 0, total = 0, num = 0, a = 0, balance = 0, i = 0;
      System.out.print("Amount of money: ");
      int money = sc.nextInt();
      
      System.out.print("How many numbers: ");
      a = sc.nextInt();
      
      do{
         System.out.print("Number: ");
         num = sc.nextInt();
         total+=num;
         balance = money - total;i ++;
         System.out.println("Continue: ");
         e = sc.next();
         if(e ==c)
            i ++;
         if(e==d)
            System.out.println("Total of money used: " + total);
         System.out.println("Balance: " + balance);
         
         
         
      }
      
      while(i > 0 );
    
      System.out.println("Total of money used: " + total);
      System.out.println("Balance: " + balance);
     
   }
}