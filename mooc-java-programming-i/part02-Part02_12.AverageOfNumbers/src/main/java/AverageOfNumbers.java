
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;
        Double counter = 0.0;

        while (true) {
            System.out.println("Give a number:");
            Double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            counter++;
            sum=sum+input;

        }
        
        System.out.println("Average of the numbers: " + (sum/counter));
    }
    
}
