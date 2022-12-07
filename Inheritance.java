class Person{
   String name, sex;
   short age;
     
   public void checkStatus(){
   
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Sex: " + sex);    
   }
   
}

class Christine extends Person {

   String felt;
  
   public void imIntoYou(){
      System.out.println("Feelings toward me: " + felt);
     
     
   } 
     
}

public class Inheritance extends TestOop{
   
   public static void main(String[] args){
   
      Person g = new Person();
      Christine glenn = new Christine();
      
      Person a = new Person();
      a.age=20;
      a.name="Nelmids";
      a.checkStatus();
      
      
   
      g.name = "Glenn";
      
      g.age = 19;
      
      g.sex = "Male\n";
      
      g.checkStatus();
      
      glenn.name = "Christine";
      glenn.age = 20;
      glenn.sex = "Female\n";
      
      glenn.checkStatus();  
      
      glenn.felt = "Nothing at all! HAHAHA!";
      glenn.imIntoYou();     
      displayName(); 
      
   
   }
}
