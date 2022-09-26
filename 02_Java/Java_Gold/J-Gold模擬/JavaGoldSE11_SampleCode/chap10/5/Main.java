import java.sql.*;

public class Main {
  public static void main(String[] args) {
    String sql = "INSERT INTO department VALUES " +
                 "(6, 'Planning', 'Yokohama', '045-333-xxxx')";
    try(Connection con = DbConnector.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql)) {
        int col = pstmt.executeUpdate();
        System.out.println("col : " + col);
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
