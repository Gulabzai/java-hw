package class15;
/*creare a method called a method one print hello world in the method

 */
public class E2 {
    void method1(){
        System.out.println("hello world");
    }
    //create a method that takes an array as imput . it adds all the numbers
    //from the array and returns the sum . name of the method should the sumArr
    //sumArr({10,10,10}) => 30
    //sumArr({10,10,40}) ==>60

    int sumArr(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        E2 e2=new E2();
       // int[]arr={10,10,10};
      //  int sum=e2.sumArr(arr);
      int sum=  e2.sumArr(new int[]{10,10,10});
        System.out.println(sum);
    }
}
