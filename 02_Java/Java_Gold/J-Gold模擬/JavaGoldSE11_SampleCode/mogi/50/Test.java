import java.sql.*;

public class Test {
  public static void main(String[] args) {
    Connection con = null;
    try {
      String url = "jdbc:mysql://localhost:3306/golddb" + 
                   "?verifyServerCertificate=false&" +
                   "useSSL=false&serverTimezone=JST" ;
      con = DriverManager.getConnection(url, "root", "training");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(con != null) con.close();
      } catch (SQLException e) { e.printStackTrace(); }
    }
  }
}
