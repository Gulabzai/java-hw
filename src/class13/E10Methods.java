package class13;

public class E10Methods {
    void printSomething(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);

    }
    void  printWordManyTimes(String word,int number){
        for (int i = 0; i < number; i++) {
            System.out.println(word);

        }
    }
}
