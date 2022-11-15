package demo;

import java.sql.*;

public class
Uebung10 {
    private static Connection conn;
    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:db01", "506-x04-u1", "testit2_");

          datenEinfuegen();
          datenEinfuegenA10_e();

            rezeptUmbenennen(1, "Pizzateig");
            schrittLoeschen(1, 2);
            rezeptLoeschen(4);
            rezeptAusgeben(1);
            rezeptAusgeben(2);
            rezeptAusgeben(3);
            rezeptAusgeben(4);

            conn.close();

        } catch (SQLException e) {
            System.out.println("Fehler beim Ausführen einer Datenbank-Anfrage: ");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Errorcode: " + e.getErrorCode());
            e.printStackTrace();
        }
    }

    public static void datenEinfuegen() throws SQLException {
        rezeptEinfuegen(1, "Pizza");
        schrittEinfuegen(1, 1, "Wasser leicht erwärmen");
        schrittEinfuegen(1, 2, "Hefe im Wasser auflösen");
        schrittEinfuegen(1, 3, "Mehl und Salz vermischen");
        schrittEinfuegen(1, 4, "Hefewasser ins Mehl kippen");
        schrittEinfuegen(1, 5, "Teig gut durchkneten");
        schrittEinfuegen(1, 6, "Öl zum Teig hinzugeben");
        schrittEinfuegen(1, 7, "Teig erneut gut durchkneten");

        rezeptEinfuegen(2, "Pfannkuchen");
        schrittEinfuegen(2, 1, "Milch, Eier, Zucker in eine Schüssel geben");
        schrittEinfuegen(2, 2, "schaumig rühren");
        schrittEinfuegen(2, 3, "Mehl langsam dazugeben, dabei rühren");
        schrittEinfuegen(2, 4, "Teig in einer Pfanne braten, einmal wenden");
    }
    public static void datenEinfuegenA10_e() throws SQLException {
        rezeptEinfuegen(3, "Toast");
        schrittEinfuegen(3, 1, "Toast auspacken");
        schrittEinfuegen(3, 2, "Toaster kalibrieren");
        schrittEinfuegen(3, 3, "Toast toasten");
        schrittEinfuegen(3, 4, "Toast belegen");

        rezeptEinfuegen(4, "Müsli");
        schrittEinfuegen(4, 1, "Müsli, Milch, Schüssel und Löffel bereit stellen");
        schrittEinfuegen(4, 2, "Müsli in die Schüssel geben");
        schrittEinfuegen(4, 3, "Milch in die Schüssel geben");
        schrittEinfuegen(4, 4, "Fertig");
    }
    public static void neueDatenEinfuegen() throws SQLException {
    }

    /**
     * Fuegt einen Datensatz in die Tabelle rezept ein.
     * @param id
     * @param name
     * @throws SQLException
     */
    public static void rezeptEinfuegen(int id, String name) {
        String updateItem = "INSERT INTO rezept (id,name) VALUES(?, ?)";
        try (PreparedStatement pstmt =
                     conn.prepareStatement(
                             updateItem)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Ausführen einer Datenbank-Anfrage: ");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Errorcode: " + e.getErrorCode());
        }
    }

    /**
     * Fuegt einen Datensatz in die Tabelle schritt ein.
     * @param id
     * @param nummer
     * @param beschreibung
     * @throws SQLException
     */
    public static void schrittEinfuegen(int id, int nummer, String beschreibung) throws SQLException {
        String updateItem = "INSERT INTO schritt (id, nummer, beschreibung) VALUES(?, ?, ?)";
        try (PreparedStatement pstmt =
                     conn.prepareStatement(
                             updateItem)) {
            pstmt.setInt(1, id);
            pstmt.setInt(2, nummer);
            pstmt.setString(3, beschreibung);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Ausführen einer Datenbank-Anfrage: ");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Errorcode: " + e.getErrorCode());
        }
    }

    /**
     * Gibt dem Rezept mit der id einen neuen Namen.
     * @param id
     * @param neuerName
     * @throws SQLException
     */
    public static void rezeptUmbenennen(int id, String neuerName) throws SQLException {
        String updateItem = "UPDATE rezept SET name=? WHERE id=?";
        try (PreparedStatement pstmt =
                     conn.prepareStatement(
                             updateItem)) {
            pstmt.setString(1, neuerName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Ausführen einer Datenbank-Anfrage: ");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Errorcode: " + e.getErrorCode());
        }
    }

    /**
     * Gibt das Rezept und die Rezeptschritte zu dem Rezept mit der id aus.
     * @param id
     * @throws SQLException
     */
    public static void rezeptAusgeben(int id) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("SELECT name FROM rezept WHERE id=?");
        pstmt.setInt(1, id);
        ResultSet resultSet = pstmt.executeQuery();
        while(resultSet.next()) {
            System.out.println("Rezept: "+ resultSet.getString("name"));
        }

        PreparedStatement pstmt2 = conn.prepareStatement("SELECT * FROM schritt WHERE id=?");
        pstmt2.setInt(1, id);
        ResultSet resultSet2 = pstmt2.executeQuery();
        while(resultSet2.next()) {
            System.out.println(" Schritt "+ resultSet2.getInt("nummer") + ": " + resultSet2.getString("beschreibung"));
        }
    }

    /**
     * Löscht das Rezept und alle Rezeptschritte zu dem Rezept mit der id aus der Datenbank.
     * @param id
     * @throws SQLException
     */
    public static void rezeptLoeschen(int id) throws SQLException {
        String updateItem = "DELETE FROM schritt WHERE id=?";
        try (PreparedStatement pstmt =
                     conn.prepareStatement(
                             updateItem)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            String updateItem2 = "DELETE FROM rezept WHERE id=?";
            try (PreparedStatement pstmt2 =
                         conn.prepareStatement(
                                 updateItem2)) {
                pstmt2.setInt(1, id);
                pstmt2.executeUpdate();

            } catch (SQLException e) {
                System.out.println("Fehler beim Ausführen einer Datenbank-Anfrage: ");
                System.out.println("Message: " + e.getMessage());
                System.out.println("SQLState: " + e.getSQLState());
                System.out.println("Errorcode: " + e.getErrorCode());
            }
        }
    }

    /**
     * Loescht einen Datensatz aus der Tabelle schritt.
     * @param id
     * @param nummer
     * @throws SQLException
     */
    public static void schrittLoeschen(int id, int nummer) throws SQLException {
        String updateItem = "DELETE FROM schritt WHERE id=? AND nummer=?";
        try (PreparedStatement pstmt =
                     conn.prepareStatement(updateItem)) {
            pstmt.setInt(1, id);
            pstmt.setInt(2, nummer);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Ausführen einer Datenbank-Anfrage: ");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Errorcode: " + e.getErrorCode());
        }
    }
}