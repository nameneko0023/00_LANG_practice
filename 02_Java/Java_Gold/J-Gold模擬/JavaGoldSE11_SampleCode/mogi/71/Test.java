import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String sql = "SELECT dept_code FROM department " + 
                 "order by dept_code";
    try(Connection con = DbConnector.getConnect();
        Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(sql)) {
      System.out.println(rs.getString(1));
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
