import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        try {
            testInsert();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void testInsert() throws SQLException {
        boolean ok = false;
        try {
            Person person = new Person();
            person.setName("Karl Tester");
            person.setSex('M');
            person.insert();

            Movie movie = new Movie();
            movie.setTitle("Die tolle Komoedie");
            movie.setYear(2012);
            movie.setType('C');
            movie.insert();
            MovieCharacter chr = new MovieCharacter();
            chr.setMovieId(movie.getId());
            chr.setPlayerId(person.getId());
            chr.setCharacter("Hauptrolle");
            chr.setAlias(null);
            chr.setPos(1);
            chr.insert();
            Genre genre = new Genre();
            genre.setGenre("Unklar");
            genre.insert();
            MovieGenre movieGenre = new MovieGenre();
            movieGenre.setGenreId(genre.getId());
            movieGenre.setMovieId(movie.getId());
            movieGenre.insert();
            ConnectionManager.getConnection().commit();
            ok = true;
        } finally {
            if (!ok)
                ConnectionManager.getConnection().rollback();
        }
    }
}
