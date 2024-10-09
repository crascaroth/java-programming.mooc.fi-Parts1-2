import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter
        // book information and to examine them

        ArrayList<Books> bookCollection = new ArrayList<>();

        while (true) {

            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            bookCollection.add(new Books(title, pages, year));

        }

        System.out.println("What information will be printed?");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Books eachBook : bookCollection) {
                System.out.println(eachBook.toString());
            }
        } else if (input.equals("name")) {
            for (Books eachBook : bookCollection) {
                System.out.println(eachBook.getTitle());
            }
        }
    }
}
