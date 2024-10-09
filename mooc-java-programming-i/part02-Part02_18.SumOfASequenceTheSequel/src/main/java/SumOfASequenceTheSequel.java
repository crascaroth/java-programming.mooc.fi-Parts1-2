
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("First number?");
        Integer beginning1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        Integer final1 = Integer.valueOf(scanner.nextLine());

        Integer sum = 0;

        for(;beginning1<=final1;beginning1++){
            sum=sum+beginning1;
        }
        System.out.println("The sum is "+sum);
    }
}
