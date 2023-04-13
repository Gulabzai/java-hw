package Class9;

public class E10Arrays //write a loop to count how many values is above arrays are false
{
    public static void main(String[] args) {
        boolean[] flags={true,false,true,false,false,true};
        int counter=0;
        for (int  i= 0;i<flags.length ; i++) {
            if(flags[i]==false){
               counter++;
            }
            }
        System.out.println(counter);

        }
    }

