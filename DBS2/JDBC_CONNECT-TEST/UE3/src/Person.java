import java.sql.*;

public class Person {

    private static final String SQL_INSERT =
            "INSERT INTO person (personID, name, sex)"+
                    " VALUES (person_id.NextVal,?,?)";
    private static final String SQL_p_ID=
            "SELECT personID FROM PERSON WHERE name LIKE ";
    private static final String SQL_DELETE=
            "DELETE FROM PERSON WHERE name LIKE ?";

    private int personID= 0;
    private String name;
    private char sex;

    public void setName(String name) {
        this.name= name;
    }
    public String getName() {return this.name;}
    public void setSex(char sex) {
        this.sex= sex;
    }
    public String getSex() {return String.valueOf(this.sex);}
    public int getId() {return this.personID;}

    public void insert() {
        Connection con= null;
        PreparedStatement pstmt= null;
        try {
            con= ConnectionManager.getConnection();
            pstmt= con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, name);
            pstmt.setString(2, String.valueOf(sex));
            pstmt.executeUpdate();
            System.out.println("PersonenDaten eingetragen.");
            con.commit();
            getIDfromDB(con);
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }

    }
    private void getIDfromDB(Connection con) {
        try  {
            Statement stmt = con.createStatement();
            String q= SQL_p_ID+"'"+name+"'";
            ResultSet rs= stmt.executeQuery(q);
            while (rs.next()){
                personID = rs.getInt(1);
                System.out.println(name+ " wurde ID: "+ personID+ " zugeteilt.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete() {
        Connection con= null;
        try {
            con= ConnectionManager.getConnection();
            PreparedStatement pstmt= con.prepareStatement(SQL_DELETE);
            pstmt.setString(1, name);
            System.out.println("PersonenDaten von: "+name+" werden gelöscht.");
            pstmt.executeUpdate();
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
    }

    public void testPrintPersonObjectAttr() {
        System.out.println("ID: " + this.personID + "\nName: " + this.name + "\nSex: " + this.sex);
    }
    public void testPrintDBpersonAttr() {
        try  {
            Connection con= ConnectionManager.getConnection();
            Statement stmt = con.createStatement();
            String q= "SELECT personID, name From PERSON WHERE name LIKE '"+ this.name+"'";
            ResultSet rs= stmt.executeQuery(q);
            while (rs.next()){
                int id= rs.getInt("personID");
                String s = rs.getString("name");
                System.out.println("person: "+id+ " name: "+ rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
