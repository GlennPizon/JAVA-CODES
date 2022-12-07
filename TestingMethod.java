import java.util.*;
public class TestingMethod{

   public static void ComputeSum(int a, int b){
      int sum = a + b;
      System.out.println("Sum of " + a + " and " + b + " is " + sum + ".");
   
   }
   
   static void Calculator(){
      char operator;
      Double number1, number2, result;
   
      Scanner input = new Scanner(System.in);
      System.out.print("CALCULATOR\n");   
      System.out.print("First number: ");
      number1 = input.nextDouble();
      
      System.out.println("Choose an operator: +, -, *, or /");
      
      operator = input.next().charAt(0);
         
      for(int i = 1; i> 0;i++){
            
         if(operator == '+' && operator == '-' && operator == '*' && operator == '/' ){
            i = 0;
            
         
         }
                  
         if(operator != '+' && operator != '-' && operator != '*' && operator != '/' ){
            System.out.println("Invalid Operator!!");
            
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);
         }
         if(operator != '+' && operator != '-' && operator != '*' && operator != '/' ){
         }
      
      }
      
      System.out.print("Second number: ");
      number2 = input.nextDouble();
   
      switch (operator) {
      
                // performs addition between numbers
         case '+':
            result = number1 + number2;
            System.out.println("Result !!!\n");
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;
      
                // performs subtraction between numbers
         case '-':
            result = number1 - number2;
            System.out.print("Result !!!");
         
            System.out.println(number1 + " - " + number2 + " = " + result);
            break;
      
                // performs multiplication between numbers
         case '*':
            result = number1 * number2;
            System.out.print("Result !!!");
         
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;
      
                // performs division between numbers
         case '/':
            result = number1 / number2;
            System.out.println("Result !!!" );
            if(number2 == 0)
               System.out.println("\nThe divisor is zero. Undefined.");
            else
               System.out.println(number1 + " / " + number2 + " = " + result);
            break;
      
         default:
            System.out.println("Invalid operator!");
            break;
      }
   
      input.close();
   }
   
   
   
   
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      System.out.println("Enter two intgers: ");
      
      
      int num1 = console.nextInt();
      int num2 = console.nextInt();
      
      ComputeSum(num1,num2);
      Calculator();
   
   }
}