package Class9;

public class E16Arrays {
    public static void main(String[] args) {

      /*there are two way of creating arraays
        create an of integer with size 5
       */
        int[] numbers=new int[5];
        int num=50;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num;
            num=num+10;


        }
        for (int number : numbers) {
            System.out.println(number);

        }

        }

        }




