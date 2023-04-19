package project2;
// Maximum and minimum number in the array
public class H8 {
    public static void main(String[] args) {
        int[] arr={20,30,25,32,1,70};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Maximum number in the array is "+max);
        System.out.println("Minimum number in the array is "+min);


    }
}
