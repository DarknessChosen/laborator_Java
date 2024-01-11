import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class GameCSVReader {
    public static List<Game> readCSV(String filePath) {
        List<Game> games = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;

                try {
                    String[] data = line.split(",");
                    Game game = createGameFromCSV(data);
                    if (game != null) {
                        games.add(game);
                    }
                } catch (Exception e) {
                    handleInvalidLineError(lineNumber, line, e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return games;
    }

    public static void sortGames(List<Game> games, Comparator<Game> comparator) {
        Collections.sort(games, comparator);
    }

    private static Game createGameFromCSV(String[] data) throws ParseException {
        if (data.length != 15) {
            System.err.println("Linie invalidă: numărul de câmpuri nu este 15");
            System.err.println("Conținutul liniei: " + Arrays.toString(data));
            throw new ParseException("Linie invalidă: numărul de câmpuri nu este 15", 0);
        }

        String game = data[0];
        String platform = data[1];
        String developer = data[2];
        String genre = data[3];

        int number_players = parseInteger(data[4]);
        double rating = parseDouble(data[5]);
        String release_date = data[6];
        int positive_critics = parseInteger(data[7]);
        int neutral_critics = parseInteger(data[8]);
        int negative_critics = parseInteger(data[9]);
        int positive_users = parseInteger(data[10]);
        int neutral_users = parseInteger(data[11]);
        int negative_users = parseInteger(data[12]);
        int metascore = parseInteger(data[13]);
        double user_score = parseDouble(data[14]);

        return new Game(game, platform, developer, genre, number_players, rating, release_date, positive_critics,
                neutral_critics, negative_critics, positive_users, neutral_users, negative_users, metascore, user_score);
    }

    private static int parseInteger(String input) throws NumberFormatException {
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Valoare invalidă pentru număr întreg: " + input);
        }
    }

    private static double parseDouble(String input) throws NumberFormatException {
        try {
            return Double.parseDouble(input.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Valoare invalidă pentru număr real: " + input);
        }
    }

    private static void handleInvalidLineError(int lineNumber, String line, Exception e) {
        System.err.println("Ignorare linie invalidă " + lineNumber + ": " + line);
        System.err.println("Cauza erorii: " + e.getMessage());
    }

    public static class PositiveComparator implements Comparator<Game> {
        @Override
        public int compare(Game game1, Game game2) {
            return Integer.compare(game1.getPositiveUsers(), game2.getPositiveUsers());
        }
    }

    // Alte comparatoare pot fi adăugate pentru alte criterii de sortare
}
