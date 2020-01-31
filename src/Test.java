import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("enter a: ");
        double a = scanner.nextDouble();
        System.out.println("enter b: ");
        double b = scanner.nextDouble();
        System.out.println("= " + calculator.isOneBiggerThanTwo(a, b));

    }
}


























