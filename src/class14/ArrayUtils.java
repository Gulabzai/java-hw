package class14;

public class ArrayUtils {
    /*
    creat a method to add to int num and it should written results back when called of the method should be add
     */
    /*
    return typs=>int
    name of the method=>add
    parameters=>(int a,int b)
    body of the method =>{
    int sum=a+b;
    return sum;

    }
     */
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        ArrayUtils obj=new ArrayUtils();// we creating object of class
        /*
        we r calling the "add" method on "obj" object passing the arugments one is 10 other is 20 and storing the resullss
        from method call into the sum variable
         */
       int sum= obj.add(10,20);
        System.out.println(sum);
    }
}
