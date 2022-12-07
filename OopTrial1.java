import java.util.*;


public class OopTrial1{

   public static void main(String[] args){
     
      computeSum(); 
              
   } 
     
     
   public static void computeSum(){
      int sum=0,n=0,num=0,a=0;  
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter how many numbers: ");
      n=sc.nextInt();
   
      int counter = 1;
      
      while(counter <= n){
         System.out.println("Number " + "[" + counter + "]");
         num = sc.nextInt();
         sum+=num;
         counter++;
      }
      
      
      System.out.println("The sum of all numbers entered: " + sum);
   
      for(int i=1;i<=n;i++){
      
         System.out.println(num);
      
      }
      
   
   } 
}
         
