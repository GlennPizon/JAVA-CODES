public class CountNumInString{

   public static void main(String[] args){
   
      
    
      isNumber("Hello124");
      isLetter("Hello12345778");
      
      
      double a = isPie(45.5);
      System.out.print(a);
      
   
   }
   
   public static double isPie(double radius){
      
      double area = (3.1416 *(radius * radius)); 
      return area;
   
   
   }

   
   public static void isLetter(String letter){
   
      int count = 0;
      
      
      for(int i = 0; i < letter.length();i++){
      
         if(letter.charAt(i) != '0' && letter.charAt(i) != '1' &&
         letter.charAt(i) != '2' && letter.charAt(i) != '3' &&
         letter.charAt(i) != '4' && letter.charAt(i) != '5' &&
         letter.charAt(i) != '6' && letter.charAt(i) != '7' && 
         letter.charAt(i) != '8' && letter.charAt(i) != '9'){
            
            System.out.print(letter.charAt(i) );
            count++;
         }
      }
      System.out.println("\nHow many letters: " + count);
   
   }
   
   public static void isNumber(String letter){
   
      int count = 0;
      
      
      for(int i = 0; i < letter.length();i++){
      
         if(letter.charAt(i) == '0' && letter.charAt(i) == '1' &&
         letter.charAt(i) == '2' && letter.charAt(i) == '3' &&
         letter.charAt(i) == '4' && letter.charAt(i) == '5' &&
         letter.charAt(i) == '6' && letter.charAt(i) == '7' && 
         letter.charAt(i) == '8' && letter.charAt(i) == '9'){
            
            System.out.print(letter.charAt(i) );
            count++;
         }
      }
      System.out.println("\nHow many numbers: " + count);
   
   }
   
   
  

}
   
   



