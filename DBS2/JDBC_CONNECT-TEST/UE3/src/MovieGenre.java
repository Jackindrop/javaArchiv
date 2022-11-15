import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieGenre {
    private static final String SQL_INSERT=
            "INSERT INTO hasGenre (movieID, genreID) "+
                    "VALUES (?, ?)";

    private int movieID;
    private int genreID;

    public void setMovieId(int i) {movieID= i;}
    public void setGenreId(int j) {genreID= j;}

    public void insert() {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setInt(1, movieID);
            pstmt.setInt(2, genreID);
            pstmt.executeUpdate();
            System.out.println("MovieChar eingetragen.");
            con.commit();
            con.close();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
    }
}
