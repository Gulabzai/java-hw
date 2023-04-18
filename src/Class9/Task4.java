package Class9;
/* create an array of car in store 6 element into it. using two different loop print all value from the array.

 */
public class Task4 {
    public static void main(String[] args) {
        String[] cars={"Toyota","MMW","Hounda","Nissan","Bugatti","Audio"};
        for (String car : cars) {
            System.out.print(car+ " ");

        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+ " ");

        }
        System.out.println();
        int i=0;
        while (i<cars.length){
            System.out.print(cars[i]+" ");
            i++;
        }
    }
}
