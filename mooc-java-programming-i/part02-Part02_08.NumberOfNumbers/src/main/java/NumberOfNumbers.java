
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer counter = 0;

        while(true){
            System.out.println("Give a number:");
            Integer input = Integer.valueOf(scanner.nextLine());
            if(input==0){
                break;
            }
            counter++;

        }
        System.out.println("Number of numbers: "+ counter);
    }
}
