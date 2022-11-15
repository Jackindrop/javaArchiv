import java.sql.*;

public class Movie {
    private static final String SQL_INSERT=
            "INSERT INTO movie (movieID, title, year, type) "+
                    "VALUES (movie_id.NextVal, ?, ? ,?)";
    private static final String SQL_m_ID=
            "SELECT movieID FROM movie WHERE title LIKE ";

    private int movieID;
    private String title;
    private int year;
    private char type;

    public void setTitle(String title) {
        this.title= title;
    }
    public void setYear(int year) {
        this.year= year;
    }
    public void setType(char type) {
        this.type= type;
    }
    public String getTitle() {return this.title;}
    public int getYear() {return this.year;}
    public char getType() {return this.type;}
    public int getId() {return this.movieID;}

    public void insert() {
        Connection con= null;
        PreparedStatement pstmt= null;
        try {
            con= ConnectionManager.getConnection();
            pstmt= con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, getTitle());
            pstmt.setInt(2, getYear());
            pstmt.setString(3, String.valueOf(getType()));
            pstmt.executeUpdate();
            System.out.println("MovieDaten eingetragen.");
            con.commit();
            getIDfromDB(con);
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
    private void getIDfromDB(Connection con) throws SQLException {

            Statement stmt = con.createStatement();
            String q= SQL_m_ID+"'"+title+"'";
            ResultSet rs= stmt.executeQuery(q);
            while (rs.next()){
                movieID = rs.getInt(1);
                System.out.println(title+ " wurde ID: "+ movieID+ " zugeteilt.");

        }
    }
}
