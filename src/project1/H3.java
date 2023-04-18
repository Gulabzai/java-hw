package project1;

public class H3 {
    public static void main(String[] args) {
        String[][] groceryList={{"Carrots","Broccoli","Spinach","Kale"},
                {"Apples","Bananas","Oranges","Grapes"},
                {"Milk","Cheese","Yogurt","Butter"},
                {"Chocolate","Candy","Ice cream","Cake"}
        };
        System.out.println();
        for (int i = 0; i <groceryList.length ; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        for (String[] Foods : groceryList) {
            for (String food : Foods) {
                System.out.print(food+" ");

            }
            System.out.println();

        }
    }
}
