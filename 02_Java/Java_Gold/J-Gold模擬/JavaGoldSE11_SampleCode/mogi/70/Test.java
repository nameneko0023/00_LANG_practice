import java.sql.*;

public class Test {
  public static void main(String[] args) throws SQLException {
    String sql = "update department set dept_address = 'tmp'";
    try(Connection con = DbConnector.getConnect();
        Statement stmt = con.createStatement()) {
      int num = stmt.executeUpdate(sql);
      System.out.println(num);
    }
  }
}
