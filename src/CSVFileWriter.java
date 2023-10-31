import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CSVFileWriter {
    public static void writePlayerData(List<VolleyballPlayer> players) {
        try (PrintWriter writer = new PrintWriter("players.csv", "UTF-8")) {
            writer.write("Name, Age, Position, Skills, Condition\n");
            for (VolleyballPlayer player : players) {
                writer.write(player.getName() + "," + player.getAge() + "," + player.getPosition() + ","
                        + player.getSkills() + "," + player.getCondition() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Грешка при запис на данни за играчи: " + e.getMessage());
        }
    }

    public static void writeAllTeamsData(List<VolleyballTeam> teams) {
        try (PrintWriter writer = new PrintWriter("all_teams.csv", "UTF-8")) {
            writer.write("Name, Stadium, Coach\n");
            for (VolleyballTeam team : teams) {
                writer.write(team.getName() + "," + team.getStadium() + "," + team.getCoach() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Грешка при запис на данни за отбори в един файл: " + e.getMessage());
        }
    }


}
