public class Row5{
   public static void main(String[] args){
      int i = 0, a = 0, g = 0;
      int numRow = 5, numCol = 5;
      
      while(i<numCol){
         while(a<numRow){
            System.out.print("*");
            a++;
         }       
         
         System.out.println("*");
         i++;
      }
   
   }
}

