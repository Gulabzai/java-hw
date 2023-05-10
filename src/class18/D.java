package class18;

public class D {
    static void print(){
        System.out.println("hello world");
    }
}
class E extends D{

}
class ETester{
    public static void main(String[] args) {
        E.print();
    }
}
