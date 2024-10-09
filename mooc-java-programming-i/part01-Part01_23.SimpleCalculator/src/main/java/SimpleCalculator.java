
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give the first number:");
        Integer first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer second = Integer.valueOf(scanner.nextLine());


     

        
        System.out.println(first+" + "+second+" = "+(int)(first+second));
        System.out.println(first+" - "+second+" = "+(int)(first-second));
        System.out.println(first+" * "+second+" = "+(int)(first*second));

        Double firstDouble = Double.valueOf(first);
        Double secondDouble = Double.valueOf(second);

        System.out.println(first+" / "+second+" = "+(firstDouble/secondDouble));
    }
}
