package Class9;
/*create an array of animal in store 5 element into it. using two different loop print all value from the array.

 */
public class Task5 {
    public static void main(String[] args) {
        String[] animals={"Cat","Dog","Cow","Donkey","Sheep",};
        for (String animal : animals) {
            System.out.print(animal+" ");

        }
        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");

        }
        System.out.println();
        int i=0;
        while (i<animals.length){
            System.out.print(animals[i]+" ");
            i++;
        }
    }
}
