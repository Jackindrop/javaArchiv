import java.sql.*;

public class Genre {
    private static final String SQL_INSERT=
            "INSERT INTO genre (genreID, genre) "+
                    "VALUES (movie_id.NextVal, ?)";
    private static final String SQL_m_ID=
            "SELECT genreID FROM genre WHERE genre LIKE ";
    private int genreID;
    private String genre;

    public void setGenre(String id) {genre= id;}
    public String getGenre() {return this.genre;}
    public int getId() {return this.genreID;}

    public void insert() {
        Connection con= null;
        PreparedStatement pstmt= null;
        try {
            con= ConnectionManager.getConnection();
            pstmt= con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, getGenre());
            pstmt.executeUpdate();
            System.out.println("Genre eingetragen.");
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
        String q= SQL_m_ID+"'"+genre+"'";
        ResultSet rs= stmt.executeQuery(q);
        while (rs.next()){
            genreID = rs.getInt(1);
            System.out.println(getGenre()+ " wurde ID: "+ genreID+ " zugeteilt.");

        }
    }
    public void update() {

    }
    public void delete() {

    }
}
