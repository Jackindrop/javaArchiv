import java.sql.*;

public class DeleteCoffee {
    private static Connection conn;
    public static void main(String[] args) {
        try {
            conn = ConnectionManager.getConnection();
            conn.setAutoCommit(false);
            deleteThisOne(150);
            deleteThisOne(101);
            deleteThisOne(49);
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public static void deleteThisOne(int id) {
        String updateItem = "DELETE FROM coffees WHERE sup_id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateItem)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {

        }
    }
}
