import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String fileName = "metacritic_games.csv";
        List<Game> games = GameCSVReader.readCSV(fileName);

        // Eliminați jocurile care au fost marcate ca null în procesul de citire
        games.removeIf(Objects::isNull);

        // Sortați jocurile după positive users
        Collections.sort(games, new PositiveComparator());

        // Afișați sau utilizați lista sortată
        for (Game game : games) {
            System.out.println(game);
        }
    }
    public static class PositiveComparator implements Comparator<Game> {
        @Override
        public int compare(Game game1, Game game2) {
            // Verificați dacă unul dintre jocuri este null și tratați cazul
            if (game1 == null && game2 == null) {
                return 0; // Dacă ambele jocuri sunt null, ele sunt considerate egale
            } else if (game1 == null) {
                return 1; // Dacă doar game1 este null, game2 este considerat mai mare
            } else if (game2 == null) {
                return -1; // Dacă doar game2 este null, game1 este considerat mai mare
            }

            // Restul logicii de comparare în funcție de positive users
            return Integer.compare(game1.getPositiveUsers(), game2.getPositiveUsers());
        }
    }

}