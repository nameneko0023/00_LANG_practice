import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String sql = "SELECT dept_code FROM department " + 
                 "where dept_code = 5 ";
    try(Connection con = DbConnector.getConnect();
        PreparedStatement pstmt = con.prepareStatement(
                sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE)) {
      ResultSet rs = pstmt.executeQuery();
      System.out.println(rs.getString(1));
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
