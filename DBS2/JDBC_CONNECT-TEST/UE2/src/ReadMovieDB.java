import java.sql.*;


/***
 * Kommandozeilenprogramm zum Auslesen von Informationen aus der MovieDB
 * @author C. Schulze, nach Version 1.0 von J. Schmidt
 */


public class ReadMovieDB {

    /***
     * Main ließt aus Kommandozeile aus
     * Gibt ungültige Eingaben als solche aus
     * @throws SQLException weil Aufruf der Methoden, die DB-Zugriffe durchführen
     */
    public static void main (String[] args) throws SQLException {
        if(args.length < 1) {
            printAllMovies();
        } else {
            try {
                int movieID = Integer.parseInt(args[0]);
                printMovieInfo(movieID);
            } catch(NumberFormatException ex) {
                System.out.println("Keine gültige Eingabe");
            }
        }
    }

    /***
     * Ließt alle Filme aus der MovieDB
     * @throws SQLException im Fall eines DB-Fehlers
     */
    private static void printAllMovies() throws SQLException {
        String sql = "SELECT title, year from Movie";
        Statement stmt = ConnectionManager.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            System.out.println("Kinofilm: " + rs.getString(1) + " (" + rs.getInt(2) + ")");
        }
        stmt.close();
        rs.close();
        ConnectionManager.getConnection().close();
    }

    /***
     * Gibt Informationen zu einem Film aus
     * @throws SQLException wegen DB-Zugriff
     */
    private static void printMovieInfo (int movieID) throws SQLException {
        // Abfrage Film
        String sql = "SELECT title, year FROM movie WHERE MovieID = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, movieID);

        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
            System.out.println("\nKinofilm: "+ rs.getString(1) + " (" + rs.getInt(2)+ ")");
        } else {
            System.out.println("Der Film mit der ID: " + movieID + "wurde nicht gefunden.");
        }


        // Abfrage Genre
        sql = "SELECT genre FROM genre INNER JOIN hasGenre ON Genre.GenreID = hasGenre.GenreID WHERE movieID = ?";
        pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, movieID);
        rs = pstmt.executeQuery();
        System.out.print("Genre: ");
        if(rs.next()) System.out.print(rs.getString(1));
        while (rs.next()) System.out.print("| " + rs.getString(1));


        // Abfrage Character
        sql = "SELECT Person.name, MovieCharacter.character FROM Person INNER JOIN MovieCharacter ON MovieCharacter.plays = Person.personID WHERE hasCharacter = ?";
        pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, movieID);
        rs = pstmt.executeQuery();
        System.out.println("\nDarsteller:");
        while (rs.next())  {
            System.out.println(" " + rs.getString(2) + ": " + rs.getString(1) + "\n");
        }

        /***
         * Verbindung schließen!
         */

        pstmt.close();
        rs.close();
        ConnectionManager.getConnection().close();
    }

}