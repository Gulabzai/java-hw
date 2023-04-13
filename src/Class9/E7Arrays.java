package Class9;

public class E7Arrays {
    public static void main(String[] args) {

       // create an Array store num 10,50,60,45,100 then print element which are present out 50 45
        int[] numbers={10,50,60,45,100};
        for (int i = 1; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);

        }

    }
}
