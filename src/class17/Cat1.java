package class17;

public class Cat1 {
    String name;
   Cat1(String catName) {
       name = catName;
       System.out.println("1 argument constructor called");
   }
   Cat1(int age){
       System.out.println("int argument constructor called");
   }
   Cat1(){
       System.out.println("o argument constructor called");
   }
   void printInfo(){
       System.out.println(name);
   }

    public static void main(String[] args) {

        Cat1 cat=new Cat1();
        cat.printInfo();//defult constructor
    }
}
