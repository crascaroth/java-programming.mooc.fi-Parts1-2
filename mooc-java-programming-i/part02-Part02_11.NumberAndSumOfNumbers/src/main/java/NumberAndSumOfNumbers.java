
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer counter = 0;
        Integer i=0;

        while (true) {
            System.out.println("Give a number:");
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {

                break;
            }
            i++;
            counter=counter+input;

        }
        System.out.println("Number of numbers: "+i);
        System.out.println("Sum of the numbers: " + counter);
    }
    
}
