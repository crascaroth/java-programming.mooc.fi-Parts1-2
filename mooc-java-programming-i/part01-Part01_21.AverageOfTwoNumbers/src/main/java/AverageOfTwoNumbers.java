
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        float first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        float second = Integer.valueOf(scanner.nextLine());

        

        System.out.println("The average is "+((first+second)/2));

    }
}
