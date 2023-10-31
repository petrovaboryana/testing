import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VolleyballPlayer player1 = new VolleyballPlayer("Мариян Иванов",30,"защитник",5,4);
        VolleyballPlayer player2 = new VolleyballPlayer("Петър Петров",28,"сетер",7,5);
        VolleyballPlayer player3 = new VolleyballPlayer("калоян Илиев",25,"нит",9,5);
        VolleyballPlayer player4 = new VolleyballPlayer("кристиян Николов",28,"защитник",9,4);
        VolleyballPlayer player5 = new VolleyballPlayer("Лщбомир Илиев",26,"нападател",6,5);
        VolleyballPlayer player6 = new VolleyballPlayer("Иван Димитров",30,"нит",5,3);

        List<VolleyballPlayer> players = new ArrayList<>();//това е лист с всички играчи и после го разделям на 2 за всеки отбор
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);

        List<VolleyballPlayer> team1Players = new ArrayList<>();
        team1Players.add(player1);
        team1Players.add(player2);
        team1Players.add(player3);

        List<VolleyballPlayer> team2Players = new ArrayList<>();
        team2Players.add(player4);
        team2Players.add(player5);
        team2Players.add(player6);

        VolleyballTeam team1 = new VolleyballTeam("Левски София", "Стадион васил левски","Ивелин Илиев",team1Players);
        VolleyballTeam team2 = new VolleyballTeam("Ботев Пловдив", "Стадион Локомотив","Красен Цонев",team2Players);
        List<VolleyballTeam> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);

        CSVFileWriter.writePlayerData(players);
        CSVFileWriter.writeAllTeamsData(teams);

        team1.calculateStrength();
        team2.calculateStrength();
        System.out.println(team1.toString());
        System.out.println(team2.toString());
        team2.train();
        team1.train();
        System.out.println(team1.toString());
        System.out.println(team2.toString());
        CSVFileWriter.writePlayerData(players);
        //това с мача не успях да го направя.. не схванах идеята на условието, как да се изчислява този резултат. Моля ако си го направил да ми споделиш в оценяването :)
        // И също така не знам каква е причината във файловете да ми излизат на шльокавица нещата..
    }
}