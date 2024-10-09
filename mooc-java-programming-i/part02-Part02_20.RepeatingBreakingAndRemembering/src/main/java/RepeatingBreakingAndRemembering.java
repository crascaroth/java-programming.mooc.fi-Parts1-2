
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        Integer sum = 0;
        Integer counter = 0;
        Integer odd = 0;
        Integer even = 0;

        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());

            if (input % 2 == 0) {
                even++;
            } else if (input % 2 == 1) {
                odd++;
            }
            if (input < 0) {
                break;
            }
            sum = sum + input;
            counter++;
        }
        Double sumdouble = Double.valueOf(sum);
        Double counterdouble = Double.valueOf(counter);

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (sumdouble / counterdouble));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
