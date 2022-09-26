import java.sql.*;
public class Test {
  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/golddb" + 
                   "?verifyServerCertificate=false&" +
                   "useSSL=false&serverTimezone=JST" ;
    String user = "root";
    String pass = "training";
    Connection con = new Connection(url, user, pass);
    Statement stmt = con.createStatement();
    String sql = "SELECT count(*) FROM department";
    ResultSet rs = stmt.executeQuery(sql);
    if(rs.next()) System.out.println(rs.getInt(1));
  }
}
