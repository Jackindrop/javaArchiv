import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArbeitszeitVerbuchen {
    public static void main(String[] args) {
        Connection conn= ConnectionManager.getConnection();
        String sql = "SELECT title, movieID FROM movie WHERE movieID = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            int movie_id= 1;
            stmt.setInt(1, movie_id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println("Kinofilm: " + rs.getString(1) + " (" + rs.getInt(2) + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
