package class14;

public class E5ArrayUtils {
    /*
    create a method called it contains it should take array of int and an int number in method body
    it should search for the array for that number if the number is present in the array method  should return true
    otherwise method should return false in a separate class call the method and test it for below
     input {10,20,45} number 20
     */
    /*
    return type=> boolean
    name of the method =>contains
    parameters =>int[] arr, int num
    body{
    foi()
    }

     */
     boolean contains(int[] arr, int num) {
        boolean isFound=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound=true;
                break;
            }
        }
       return isFound;
    }
}
