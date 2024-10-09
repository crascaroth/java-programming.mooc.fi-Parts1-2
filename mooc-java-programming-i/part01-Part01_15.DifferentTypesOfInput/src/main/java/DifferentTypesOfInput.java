
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String Stringvar = String.valueOf(scan.nextLine());

        System.out.println("Give an integer:");
        Integer Integervar = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        Double Doublevar = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean Booleanvar = Boolean.valueOf(scan.nextLine());


        System.out.println("You gave the string "+Stringvar);
        System.out.println("You gave the integer "+Integervar);
        System.out.println("You gave the double "+Doublevar);
        System.out.println("You gave the boolean "+Booleanvar);



    }
}
