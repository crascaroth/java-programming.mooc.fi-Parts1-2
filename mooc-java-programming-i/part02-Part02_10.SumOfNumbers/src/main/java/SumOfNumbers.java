
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer counter = 0;

        while (true) {
            System.out.println("Give a number:");
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {

                break;
            }
            counter=counter+input;

        }
        System.out.println("Sum of the numbers: " + counter);
    }
}
