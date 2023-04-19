package project2;
/*. Write a java program to check whether a given
        number is prime or not?

 */
public class H6 {
    public static void main(String[] args) {
        int num = 17; // example number to check

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

}

}
