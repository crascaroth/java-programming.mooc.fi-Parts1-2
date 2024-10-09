
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    //  System.out.println("First number?");
    //  Integer beginning1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a number:");
        Integer final1 = Integer.valueOf(scanner.nextLine());

        Integer sum = 1;

        for(int i=1;i<=final1;i++){
            sum=sum*i;
        }
        System.out.println("Factorial: "+sum);
    }
}
