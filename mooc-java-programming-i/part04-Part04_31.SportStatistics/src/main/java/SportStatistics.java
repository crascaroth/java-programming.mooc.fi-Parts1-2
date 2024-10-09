
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int gamesCounter = 0;

        int wins = 0;
        int losses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (fileReader.hasNextLine()) {

                String lineInfo = fileReader.nextLine();
                if (lineInfo.isEmpty()) {
                    continue;
                }

                String[] parts = lineInfo.split(",");
                int firstTeam = Integer.valueOf(parts[2]);
                int secondTeam = Integer.valueOf(parts[3]);
                if (parts[0].equals(team)) {
                    gamesCounter++;
                    if (firstTeam > secondTeam) {
                        wins++;
                    } else {
                        losses++;
                    }

                } else if (parts[1].equals(team)) {
                    gamesCounter++;
                    if (secondTeam > firstTeam) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gamesCounter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
