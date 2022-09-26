import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String sql = "UPDATE department set " +
                 "dept_address='Tokyo' "+
                 "where dept_code = 33";
    try(Connection con = DbConnector.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql)) {
      int col = pstmt.executeUpdate();
      System.out.println(col);
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
