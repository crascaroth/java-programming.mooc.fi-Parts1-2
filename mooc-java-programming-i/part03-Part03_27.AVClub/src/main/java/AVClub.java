
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) {
                break;
            } else {
                String[] pieces = phrase.split(" ");
                for (String i : pieces) {
                    if (i.contains("av")) {
                        System.out.println(i);
                    }

                }
            }
        }

    }
}
