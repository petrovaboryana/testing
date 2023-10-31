import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class VolleyballTeam implements Restable,Trainable{
    //Да се създаде клас волейболен отбор с полета: име, стадион, треньор и играчи. Каква структура от
    //данни ще използвате за играчите? Класът има и методи calculateStrength(), който изчислява силата на
    //отбор като средно аритметично от уменията на играчите. Както и методи teamTraining() и teamRest() -
    //целият отбор тренира или почива.
    private String name;
    private String stadium;
    private String coach;
    private List<VolleyballPlayer> players;

    public String getName() {
        return name;
    }

    public String getStadium() {
        return stadium;
    }

    public String getCoach() {
        return coach;
    }

    public VolleyballTeam(String name, String stadium, String coach, List<VolleyballPlayer> players) {
        this.name = name;
        this.stadium = stadium;
        this.coach = coach;
        this.players = players;
    }
    public void calculateStrength() {
        int totalSkills = 0;
        for (VolleyballPlayer player : players) {
            totalSkills += player.getSkills();
        }
        int teamStrength = (totalSkills / players.size());
        System.out.println("Сила на отбор " + name + " e: " + teamStrength);
    }

    @Override
    public void rest() {
        for (VolleyballPlayer player : players) {
            player.rest();
        }
        System.out.println("Целият отбор почива в момента!");
    }

    @Override
    public void train() {
        for (VolleyballPlayer player : players) {
            player.train();
        }
        System.out.println("Целият отбор е на тренировка!");
    }

    @Override
    public String toString() {
        return "VolleyballTeam{" +
                "name='" + name + '\'' +
                ", stadium='" + stadium + '\'' +
                ", coach='" + coach + '\'' +
                ", players=" + players +
                '}';
    }
}
