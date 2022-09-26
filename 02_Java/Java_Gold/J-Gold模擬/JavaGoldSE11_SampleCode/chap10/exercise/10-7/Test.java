import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String sql1 = "SELECT count(*) FROM department";
    String sql2 = "INSERT INTO department " + 
                  "VALUES (13,'a','b', 'c')";
    try(Connection con = DbConnector.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql1)) {
      ResultSet rs = pstmt.executeQuery();
      int num = pstmt.executeUpdate(sql2);
      System.out.print(num + " ");
      if(rs.next()) System.out.println(rs.getString(1));
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
