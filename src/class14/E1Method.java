package class14;

public class E1Method {
    void printWord(String word){
        System.out.println(word);
    }
    /*
    void =>return type of the method void means this method dose.not written any data
    and other ex of return type can be String, int boolean char dog cat etc.
    printWord=> is the name of the method
    String word => is the parameters/input
      {System.out.println(word);} =>body of the method you can write if else condition loops etc
     */


    public static void main(String[] args) {
        // we are creating on object od the E1method class
        // in java all the classes can be treated as day type
        //new E1Method() => creating the object of the E1Method class
        E1Method obj=new E1Method();
        //we are calling the printWord() method on obj object and passing "Java" as argument for input
        obj.printWord("Java");
    }
}
