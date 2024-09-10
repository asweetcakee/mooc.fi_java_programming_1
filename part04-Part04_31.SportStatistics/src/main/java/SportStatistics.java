
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String searchFor = scan.nextLine();
        scan.close();
        
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] parts = data.split(",");
                teams.add(new Team(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int gamesCounter = 0;
        int winsCounter = 0;
        int lossesCounter = 0;

        for (Team team : teams) {
            if (team.gamesPlayedByTeam(searchFor)) {
                if (team.getHomeTeam().equals(searchFor)) {
                    if (team.isHomeTeamWinner()) {
                        winsCounter++;
                    } else {
                        lossesCounter++;
                    }
                } else {
                    if (team.isHomeTeamWinner()) {
                        lossesCounter++;
                    } else {
                        winsCounter++;
                    }
                }
                gamesCounter++;
            }
        }

        System.out.println("Games: " + gamesCounter);
        System.out.println("Wins: " + winsCounter);
        System.out.println("Losses: " + lossesCounter);
    }
}
