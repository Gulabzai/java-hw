package class15;

import java.util.Arrays;

public class E1 {
    //the createArray(size) a methods  takes an integer parameter size and creats an array of that size.in

    /*it then fill the array with the numbers lets
    say  10 using for loop and finally returns the array.*/
    //createArray(5) =>{10,10,10,10,10}
    //createArray(3) =>{10,10,10}

    int[]createArray(int size){
        int [] arr=new int [size];
        for (int i = 0; i < size; i++) {
            arr[i]=10;

        }
        return arr;

    }

    public static void main(String[] args) {
        E1 e1=new E1();
        int[] array = e1.createArray(5);
       // System.out.println(Arrays.toString(array));
        /*for (int i : array) {
            System.out.println(i);*/
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        }
    }


