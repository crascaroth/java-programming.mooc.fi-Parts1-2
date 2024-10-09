
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());


        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner scanner1 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner1.hasNextLine()) {
                // we read one line
                Integer row = Integer.valueOf(scanner1.nextLine());
                // we print the line that we read
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        int counter=0;

        for(int i : list){
            if(i>= lowerBound && i<=upperBound){
                counter++;
            }
        }
        System.out.println("Numbers: "+counter);


    }

}
