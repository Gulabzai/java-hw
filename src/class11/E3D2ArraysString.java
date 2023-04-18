package class11;

public class E3D2ArraysString {
    public static void main(String[] args) {
        String[][] names2DArray={{"Sarah","Jamil","Ahmad","Omid"},
                {"Farwa","Khatera","Khalida","Ghoti"}
        };

       for(String[] name1DArr:names2DArray){
           for (String name : name1DArr) {
               System.out.print(name+" ");

           }
           System.out.println();
       }


    }
}
