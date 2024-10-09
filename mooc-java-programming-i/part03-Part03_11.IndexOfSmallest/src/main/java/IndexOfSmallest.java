
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        Integer lowest = 0;

        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                lowest = list.get(i);
            }
            if (list.get(i) < lowest) {
                lowest = list.get(i);
            }

        }
        System.out.println("Smallest number: " + lowest);

        for (int i = 0; i < list.size(); i++) {

            if (lowest == list.get(i)) {
                System.out.println("Found at index: " + i);
            }

        }

    }

}
