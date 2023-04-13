package Class9;

public class E4Arrays {
    public static void main(String[] args) {
/*create an array of Strings Store 5 names i that array

 */
        String[] names={"Jamil","ahmad","aziz","Zabi","Farhad"};
        for (int i=0;i<5;i++){  //we can wright names.lenght as well replace 5
            System.out.print(names[i]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
