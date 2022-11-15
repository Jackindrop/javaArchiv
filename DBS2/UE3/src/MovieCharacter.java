import java.sql.*;

public class MovieCharacter {
    private static final String SQL_INSERT=
            "INSERT INTO MovieCharacter (movieID, character, alias, position, plays, hasCharacter) "+
                    "VALUES (movie_id.NextVal, ?, ? ,? ,?, ?)";
    private static final String SQL_m_ID=
            "SELECT movieID FROM movie WHERE movieID LIKE ";

    private int movieID;
    private String character;
    private String alias;
    private int pos;
    private int plays;
    private int hasCharacter;

    public void setMovieId(int id) {movieID= id;}
    public void setCharacter(String charac) {character= charac;}
    public void setAlias(String al) {alias= al;}
    public void setPos(int i) {pos= i;}
    public void setPlayerId(int i) {plays= i;}
    public int getMovieID() {return this.movieID;}
    public String getCharacter() {return this.character;}
    public String getAlias() {return this.alias;}
    public int getPos() {return this.pos;}
    public int getPlays() {return this.plays;}
    public int getHasCharacter() {return this.hasCharacter;}

    public void insert() {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, getCharacter());
            pstmt.setString(2, getAlias());
            pstmt.setInt(3, getPos());
            pstmt.setInt(4, getPlays());
            pstmt.setInt(5, getHasCharacter());
            pstmt.executeUpdate();
            System.out.println("MovieChar eingetragen.");
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
        String q= SQL_m_ID+"'"+movieID+"'";
        ResultSet rs= stmt.executeQuery(q);
        while (rs.next()){
            movieID = rs.getInt(1);
            System.out.println(movieID+ " wurde ID: "+ movieID+ " zugeteilt.");

        }
    }
}
