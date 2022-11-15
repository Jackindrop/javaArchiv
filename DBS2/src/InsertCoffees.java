import java.sql.*;

public class InsertCoffees {

  public static void main(String args[]) throws SQLException {
    Connection con = null;
    Statement stmt = null;
    try {
    	con =  ConnectionManager.getConnection();
        con.setAutoCommit(false);
	    stmt = con.createStatement();
	    stmt.executeUpdate("insert into COFFEES " +
	            "values('Colombian', 00101, 7.99, 0, 0)");

	    stmt.executeUpdate("insert into COFFEES " +
	         "values('French_Roast', 00049, 8.99, 0, 0)");
	    stmt.executeUpdate("insert into COFFEES " +
	         "values('Espresso1', 00150, 9.99, 0, 0)");
	    stmt.executeUpdate("insert into COFFEES " +
	          "values('Colombian_Decaf', 00101, 8.99, 0, 0)");
	    stmt.executeUpdate("insert into COFFEES " +
	         "values('French_Roast_Decaf', 00049, 9.99, 0, 0)");
        con.commit();
      System.out.println("Datensaetze in Tabelle COFFEES eingefuegt");

    } catch(SQLException e) {
        e.printStackTrace();
        con.rollback();
    }

    finally{
          try {
            stmt.close();   con.close();
            System.out.println("aufgeraeumt");
          }
          catch (Exception e) {e.printStackTrace();}
    }
  }
}

