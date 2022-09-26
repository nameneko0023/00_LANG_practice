import java.sql.*;
public class Test {
  public static void main(String[] args) 
                                     throws SQLException {
    String sql = "SELECT dept_name FROM department " + 
                 "where dept_code = ? ";
    try(var con = DbConnector.getConnect();
        var pstmt = con.prepareStatement(sql)) {
      print(pstmt, 1);
      print(pstmt, 3); 
    } catch (SQLException e) { e.printStackTrace(); }
  }
  static void print(PreparedStatement p, int code)
                                     throws SQLException {
      p.setInt(1, code);
      ResultSet rs = p.executeQuery();
      rs.next();
      System.out.print(rs.getObject(1) + " ");
  }
}
