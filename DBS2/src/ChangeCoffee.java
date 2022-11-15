import java.sql.*;
public class ChangeCoffee {
    private static Connection conn;
    public static void main(String[] args) {
        try {
            conn = ConnectionManager.getConnection();
            name(150, "Spritzputz");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ändert name eines an der sup_id zugeordneten Coffees
    public static void name(int sup_id, String newName) {
        String updateItem = "UPDATE coffees SET cof_name= ?" +
                "WHERE sup_id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(
                updateItem)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, sup_id);
            pstmt.executeUpdate();
            System.out.println("Name geändert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
