import java.util.*;

public class NumbersToWordsConverter
{
   /*
      Create a function name GetOnes that extracts the ones part of a number
      example:  1231 = 1 = returns the word "One"
      Challenge: Without using an array
   */
   public static String getOnes(int number)
   {
   
      String str = Integer.toString(number);
         
         
      int a = str.length()-1;
        
      if(str.charAt(a) == '0'){
         return " ";}
      if(str.charAt(a) == '1'){
         return "One\n";}
      if(str.charAt(a) == '2'){
         return "Two\n";}
      if(str.charAt(a) == '3'){
         return "Three\n";}
      if(str.charAt(a) == '4'){
         return "Four\n";}
      if(str.charAt(a) == '5'){
         return "Five\n";}
      if(str.charAt(a) =='6'){
         return "Six\n";}
      if(str.charAt(a) == '7'){
         return "Seven\n";}
      if(str.charAt(a) == '8'){
         return "Eight\n";}
         
      if(str.charAt(a) == '9'){
         return "Nine\n";
         
         
      }
        
                
        
      return "";
        
        
      
   }
        
   public static String getTens(int num)
   {  
   
      String str = Integer.toString(num);
      
      int a = str.length()-2;
      
      if(str.charAt(a)=='1'){
         return "";}
      if(str.charAt(a)=='2')
         return "Twenty ";
      if(str.charAt(a)=='3')
         return "Thirty ";
      if(str.charAt(a)=='4')
         return "Fourthy ";
      
      if(str.charAt(a)=='5')
         return "Fifty ";
      if(str.charAt(a)=='6')
         return "Sixty ";
      
      if(str.charAt(a)=='7')
         return "Seventy ";
         
      if(str.charAt(a)=='8')
         return "Eighty ";
      if(str.charAt(a)=='9'){
        
      }
      
      
      return " ";
        
        
    
   }
   
   /*
      Create a function name GetHundreds that extracts the hundreds part of a number
      example:  1231 = 2 = returns the word "Two hundred"
      Challenge: Without using an array      
   */   
   public static String getHundreds(int num)
   {
   
      String st = Integer.toString(num);
      int a = st.length()-3;
      
      if(st.charAt(a)=='1')
      
      
         return "One Hundred ";
      
      if(st.charAt(a)=='2')
         return "Two Hundred ";
      if(st.charAt(a)=='3')
         return "Three Hundred ";
      if(st.charAt(a)=='4')
         return "Four Hundred ";
      
      if(st.charAt(a)=='5')
         return "Five Hundred ";
      if(st.charAt(a)=='6')
         return "Six Hundred ";
      
      if(st.charAt(a)=='7')
         return "Seven HUndred ";
         
      if(st.charAt(a)=='8')
         return "Eight Hundred ";
      if(st.charAt(a)=='9'){
         return "Nine Hundred ";
      
      
      
      
      
      
      }
      
      return "";      }   
   
   
   /*   Create a function name GetThousands that extracts the thousands part of a number
      example:  1231 = 1 = returns the word "One Thousand"
      Challenge: Without using an array      
   */   
   public static String getThousands(int num)
   {
   
      
      return "";
   }   
   

      
   
      
   
   /*
      Create a function name GetTens that extracts the tens part of a number
      example:  1231 = 3 = returns the word "Thirty"
      Challenge: Without using an array
   */   
         
   /*
      Create a function name convert that accepts 1 integer value parameter, the number,
      and convert it to words.
      
      This function calls the other 4 functions:
      getOnes, getTens, getHundreds, getThousands so that it can
      convert the number to words    
      
      
      Minimum allowed value: 1
      Maximum allowed value: 9999
      
      If the value of the number is out of range, return "INVALID"    
      
      Challenge: Without using an array                    
   */

   public static void main(String[] args)
   {
      Scanner con = new Scanner(System.in);
      int number;
      NumbersToWordsConverter a = new NumbersToWordsConverter();
   
   
      System.out.println("Enter number: ");
      number = con.nextInt();
      
      String r = a.getOnes(number);
      String c = a.getTens(number);
      String p = a.getHundreds(number);
      
      System.out.print("\nResult: " + p + c + r);
     
    
      
      /*
         Test the function that you have created name convert here in main method
         by allowing the user to enter a number either 1 to 9999 and convert it to words.
         DO NOT test the other functions here: getTens, getOnes, getHundreds, getThousands
         Only call the function convert here
         
         Example Program Run:
         
         Enter a number (1 - 99999): 3415
         Output: Three-thousand four-hundred fifteen
         
         Example Program Run:         
         Enter a number (1 - 99999): 9099
         Output: Nine-thousand Ninety-Nine
         
         Example Program Run:
         Enter a number (1 - 99999): 418
         Output: Four-Hundred Eighteen
      */
      
      
   }
}