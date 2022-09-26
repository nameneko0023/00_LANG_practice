import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String sql = "select * from user";
    try {
      new Test().selectAll(sql);
    } catch(SQLException e) { }
  }
  public void selectAll(String sql) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet result = null;
    try {
      con = DbConnector.getConnect();
      pstmt = con.prepareStatement(sql);
      result = pstmt.executeQuery();
    } catch (SQLException e) {
      // ÉGÉâÅ[èàóù
    } finally {
      result.close(); 
      pstmt.close(); 
      con.close();
    }
  }
}
