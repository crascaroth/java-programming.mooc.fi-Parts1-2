
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer oldest =0;
        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) {
                break;
            }
            String[] pieces = phrase.split(",");
            if(oldest<Integer.valueOf(pieces[1])){
                oldest=Integer.valueOf(pieces[1]);
            }
            
        }
        System.out.println("Age of the oldest: "+oldest);


    }
}
