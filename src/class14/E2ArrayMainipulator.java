package class14;

import java.util.Scanner;

public class E2ArrayMainipulator {
    /*
    create a method that will print array call it sumArr and return the sum of the all elements that array create
    the object of the class and call the method.
     */
    /*
    return type int
    name of the method => suArr
    parameters => (int[]arr)
    body =>
    {go through all the element of the array add them and return the results
     */
    int sumArr(int[]arr){
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;


    }

    public static void main(String[] args) {
        E2ArrayMainipulator obj=new E2ArrayMainipulator();
        int[] array={10,20,30};
        int result =obj.sumArr(array);
        System.out.println(result);
    }



    }


