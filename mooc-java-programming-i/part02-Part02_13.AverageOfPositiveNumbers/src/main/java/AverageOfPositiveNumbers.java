
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;
        Integer counter = 0;

        while (true) {
            Double input = Double.valueOf(scanner.nextLine());
            if (counter == 0 && input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (input > 0) {
                sum = sum + input;
                counter++;
            } else if (input == 0) {
                break;
            }

        }
        System.out.println(sum/counter);

    }
}
