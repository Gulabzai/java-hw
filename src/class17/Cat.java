package class17;

public class Cat {
    String name;
   Cat (String catName) {
       name = catName;
       System.out.println("1 argument constructor called");
   }
   Cat(int age){
       System.out.println("int argument constructor called");
   }
   Cat(){
       System.out.println("o argument constructor called");
   }
   void printInfo(){
       System.out.println(name);
   }

    public static void main(String[] args) {

        Cat cat=new Cat("Tanji");
        cat.printInfo();//defult constructor
    }
}
