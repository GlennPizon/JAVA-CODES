import java.util.*;



public class Calculator



{





   public  double num1;

   public  double num2;

   

   

   

   public double computeSum(){  
   
   
      return num1 + num2; 
   
   }

   public double computeDifference(){
   
   
   
      return    num1 - num2;      
   }



   public double computeProduct(){
   
         
      return num1*num2; 
   
   
   
   
   
   }

   

   public double computeQuotient(){
         
      return num1/num2;
   
   
   
   }

   

   public double computeRemainder(){
   
   
      return  num1%num2;
   
   
   
   
   
   }

	/* create your own data type MyCalculator that has 2 attributes or instance variables of type double



	namely: num1 and num2, and create the method definition of the following:







	public double computeSum()



	public double computeDifference()



	public double computeProduct()



	public double computeQuotient()



	public double computeRemainder()







	the variables num1 and num2 will be used in the functions above







	test the class that you have created in the main method



	*/







   public static void main(String[] args)
   
   
   
   {
   
   
   
      Scanner s = new Scanner(System.in);
   
   
   
        // create an object of Scanner class
   
      Scanner input = new Scanner(System.in);
   
      Calculator sc = new Calculator();
   
   
   
        
   
      double num1 = 0, num2 = 0, operator = ' ';
   
      for(int i = 1; i > 0; i++){
      
         System.out.println("\nEnter first number");
      
         sc.num1 = input.nextDouble();
      
      
      
        // ask users to enter operatorerator
      
         System.out.println("Choose an operatorer: +, -, *, or /");
      
         operator = input.next().charAt(0);
      
      
      
      
      
         System.out.println("Enter second number");
      
         sc.num2 = input.nextDouble();
      
      
      
      
      
        
      
         if( operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%'){
         
            System.out.println("Invalid Operator!!!");
         
            i++;
         
         }
         
         
         
         else
         
            i = -1;
      
      
      
      
      
      }
   
      
   
      if(operator == '+'){
      
      
      
         double total = sc.computeSum();
      
         System.out.println( sc.num1 + " + " + sc.num2 + " is " + String.format("%.2f" , total) );         
          
      
      
      
      }
   
   
   
      if(operator == '-'){
      
      
      
         double total = sc.computeDifference();
      
         System.out.println( sc.num1 + " - " + sc.num2 + " is " + String.format("%.2f" , total) );
      
          
      
      
      
      }
   
      
   
      if(operator == '*'){
      
      
      
         double total = sc.computeProduct();
      
         System.out.println( sc.num1 + " * " + sc.num2 + " is " + String.format("%.2f", total) );         
          
      
      
      
      }
   
   
   
      if(operator == '/'){
      
      
      
         if(sc.num2 == 0){
         
            System.out.print("UNDEFINED OR CANNOT BE DIVIDED TO ZERO!!!!");
         
         
         
         }
         
         
         
         else{
         
         
         
            double total = sc.computeQuotient();
         
            System.out.println( sc.num1 + " / " + sc.num2 + " is " + String.format("%.2f", total) );
         
         }
      
         
      
         
      
      }
   
         
   
         
   
      
   
      if(operator == '%'){
      
      
      
         if(sc.num2 == 0){
         
            System.out.print("Cannot perform transaction!!!!");
         
         }
         
         
         
         else {
         
            double total = sc.computeRemainder();
         
            System.out.println( sc.num1 + " % " + sc.num2 + " is " + String.format("%.2f", total) );
         
          
         
         }
      
      }
   
      
   
      
   
        
   
   
   
   }

      

}