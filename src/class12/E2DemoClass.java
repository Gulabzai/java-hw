package class12;

public class E2DemoClass {
    public static void main(String[] args) {
        String userName="admin";
        String password="pass123";
        //Write a code to cheak the username and password if the username and
        //password are less
        if (userName.length()>8 && password.length()>8){
            System.out.println("username and password can.t be more than 8 charcater");
        }else {
            System.out.println("sinup successful");
        }
    }
}
