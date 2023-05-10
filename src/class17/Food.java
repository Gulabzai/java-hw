package class17;

public class Food {
    String name="Pasta";

    void printFood(){
        String name="burger";
        System.out.println(name);
        System.out.println(this.name);// this is refer instant varible
    }
//beacuse burger in the conssol java prefer local variable
    public static void main(String[] args) {
        Food food=new Food();
        food.printFood();
    }
}
