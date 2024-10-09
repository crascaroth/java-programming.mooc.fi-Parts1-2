
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = Integer.valueOf(scanner.nextLine());
        Integer number2 = Integer.valueOf(scanner.nextLine());
        Double result= Double.valueOf(number1 + number2);
        double squareRoot = Math.sqrt(result);
        System.out.println(squareRoot);
    }
}
