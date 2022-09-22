import java.util.Scanner;

public class Mainjava {
    public static void main(String[] args) {

        System.out.println("chosse number");
        Scanner number1 = new Scanner(System.in);
        int num = number1.nextInt();
        System.out.println("chouse number2");
        Scanner number2= new Scanner(System.in);
        int num2 = number2.nextInt();
        System.out.println("chosse which process");
        Scanner model = new Scanner(System.in);
        String operater = model.nextLine();

        switch (operater){
            case "+":
                System.out.println(num+num2);
            case "-":
                System.out.println(num-num2);
            case "*":
                System.out.println(num*num2);
            default:
                System.out.println("ur chosse isnt correct");

        }

    }

}
