package project1;

public class H6 {
    public static void main(String[] args) {
        String[][] countries={{"USA","Canada","Mexico"},
                {"Brazil","Argentina","Colombia"},
                {"UK","France","Germany"},
                {"Japan","Afghanistan","UAE"},
                {"Nigeria","South Africa","Egypt"}
        
        };
        for (int i = 0; i <countries.length; i++) {
            for (int j = 0; j <countries[i].length ; j++) {
                System.out.print(countries[i][j]+" ");
                
            }
            System.out.println();
            
        }
        System.out.println();
        for (String[] continent : countries) {
            for (String country : continent) {
                System.out.print(country+" ");
                
            }
            System.out.println();
            
        }
        System.out.println();
        int counter=0;
        for (String[] continent : countries) {
            for (String country : continent){
                counter++;
            }
        }
        System.out.println("counter = " + counter);
            
        }
    }

