
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics calculator = new Statistics();
        Statistics numberEven = new Statistics();
        Statistics numberOdd = new Statistics();
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the
        // exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

        while (true) {
            System.out.println("Enter numbers: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                break;
            }
            if(number%2==0){
                numberEven.addNumber(number);
            }else if (number%2==1){
                numberOdd.addNumber(number);
            }
            calculator.addNumber(number);

        }
        System.out.println("Count: " + calculator.getCount());
        System.out.println("Sum: " + calculator.sum());
        System.out.println("Average: " + calculator.average());
        System.out.println("Sum of even number: " + numberEven.sum());
        System.out.println("Sum of odd number: " + numberOdd.sum());

    }
}
