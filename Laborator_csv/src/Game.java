import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Game implements Comparable<Game> {
    private String name;
    private String platform;
    private String developer;
    private String genre;
    private int numberPlayers;
    private double rating;
    private Date releaseDate;
    private int positiveCritics;
    private int neutralCritics;
    private int negativeCritics;
    private int positiveUsers;
    private int neutralUsers;
    private int negativeUsers;
    private int metascore;
    private double userScore;

    // Constructor
    public Game(String name, String platform, String developer, String genre, int number_players,
                double rating, String release_date, int positive_critics, int neutral_critics,
                int negative_critics, int positive_users, int neutral_users, int negative_users,
                int metascore, double user_ucore) throws ParseException {
        this.name = name;
        this.platform = platform;
        this.developer = developer;
        this.genre = genre;
        this.numberPlayers = number_players;
        this.rating = rating;
        this.releaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(release_date);
        this.positiveCritics = positive_critics;
        this.neutralCritics = neutral_critics;
        this.negativeCritics = negative_critics;
        this.positiveUsers = positive_users;
        this.neutralUsers = neutral_users;
        this.negativeUsers = negative_users;
        this.metascore = metascore;
        this.userScore = user_ucore;
    }
    // game,platform,developer,genre,number_players,rating,release_date,positive_critics
// neutral_critics,negative_critics,positive_users,neutral_users,
// negative_users,metascore,user_score

    // Getteri și setteri
    // Am pus aici getteri și setteri pentru positive_users si positive_critics
    public int getPositiveUsers() {
        return positiveUsers;
    }

    public int getPositiveCritics() {
        return positiveCritics;
    }

    @Override
    public int compareTo(Game other) {
        return this.releaseDate.compareTo(other.releaseDate);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", developer='" + developer + '\'' +
                ", genre='" + genre + '\'' +
                ", numberPlayers=" + numberPlayers +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                ", positiveCritics=" + positiveCritics +
                ", neutralCritics=" + neutralCritics +
                ", negativeCritics=" + negativeCritics +
                ", positiveUsers=" + positiveUsers +
                ", neutralUsers=" + neutralUsers +
                ", negativeUsers=" + negativeUsers +
                ", metascore=" + metascore +
                ", userScore=" + userScore +
                '}';
    }
}
