class Glenn extends Person{
   String item;
   
   public void hadRing(){
      
      System.out.println("I have a " + item);
   }
}

class Christine extends Person{
   String item;
   public void hadRing(){
      
      System.out.println("I have a " + item);
   }

}

class Church{

}

class Person{
   String name,sex;
   short age;

   public void checkInfos(){
      System.out.println("Name: " + name);
      System.out.println("Sex: " + sex);
      System.out.println("Age: " + age);
   
   
   }



}

public class Faith{

   public static void main(String[] args){
   
      Person a = new Person();
      Glenn b = new Glenn();
      Christine c = new Christine();
      Church d = new Church();
      b.name="Glenn Pizon";
      b.age = 19;
      b.sex = "Male";
      b.item = "Wedding Ring\n";
      b.checkInfos();
      b.hadRing();
      
      c.name=" Christine";
      c.age = 20;
      c.sex = "Female";
      c.item = "Flowers";
      c.checkInfos();
      c.hadRing();
      
      
               
      
               
   }
}