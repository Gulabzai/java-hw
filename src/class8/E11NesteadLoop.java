package class8;

public class E11NesteadLoop {
    public static void main(String[] args) {

        for (int i = 2; i < 11; i=i+2) {
            System.out.print(i+" ");

        }
        System.out.println();
        int counter=0;
        while (counter<4){
            for (int i = 2; i < 11; i=i+2) {
                System.out.print(i+" ");

            }
            counter++;
        }
    }
}
