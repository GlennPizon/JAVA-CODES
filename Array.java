public class Array{
   public static void main(String[] args){
      
      
      
         
    // create an array
      int[] numbers = {3, 9, 5, -5, 0, 1, 2, 3, 4};
    
    // for each loop 
      int count = 0;
      for (int i = 0; i < 9; i++){ 
         System.out.println(numbers[i]);
         if(numbers[i] >= 1){
            
            count++;
         }
      }
      System.out.println(" \nNumbers of elements: " + count);
      
   
   }
}