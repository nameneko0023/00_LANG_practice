import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String sql = "SELECT dept_code FROM department " + 
                 "order by dept_code";
    try(Connection con = DbConnector.getConnect();
        Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql)) {
      rs.beforeFirst(); rs.absolute(3);
      rs.previous();  rs.relative(2);
      System.out.println(rs.afterLast());
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
