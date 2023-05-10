package class17;

public class Cat2 {
    String name;
   Cat2(String catName) {
       name = catName;
       System.out.println("1 argument constructor called");
   }
   Cat2 (String name,String color){

   }
   Cat2(int age){
       System.out.println("int argument constructor called");
   }
   Cat2(){
       System.out.println("o argument constructor called");
   }
   void printInfo(){
       System.out.println(name);
   }

    public static void main(String[] args) {

        Cat2 cat=new Cat2("lobi","color");
        cat.printInfo();//defult constructor
    }
}
