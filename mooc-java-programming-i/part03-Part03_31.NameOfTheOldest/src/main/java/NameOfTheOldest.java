
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Integer oldest =0;
        String nameOldest="";
        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) {
                break;
            }
            String[] pieces = phrase.split(",");
            if(oldest<Integer.valueOf(pieces[1])){
                oldest=Integer.valueOf(pieces[1]);
                nameOldest = pieces[0];
            }
            
        }
        System.out.println("Name of the oldest: "+nameOldest);

    }
}
