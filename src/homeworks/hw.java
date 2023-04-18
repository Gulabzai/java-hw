package homeworks;
/* create an array of char in store grades into it :A,B,C,D.
then print a B (use 2 different ways of creating an array)

 */
public class hw {
    public static void main(String[] args) {
        // Loop 1
        char[] grade = {'A', 'B', 'C', 'D',};
        System.out.println(grade[1]);

        //Loop 2
        System.out.println();
        char[] Grade = new char[4];
        Grade[0] = 'A';
        Grade[1] = 'B';
        Grade[2] = 'C';
        Grade[2] = 'E';
        System.out.println(Grade[1]);
    }
}