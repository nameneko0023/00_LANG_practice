import java.sql.*;

public class Main {
  public static void main(String[] args) {
    String insertSQL = "INSERT INTO department VALUES " +
                       "(7, 'Planning', 'Yokohama', '045-333-xxxx')";
    
    String selectSQL = "SELECT dept_name FROM department "  +
                       "WHERE dept_code = 2";
    try(Connection con = DbConnector.getConnect();
        PreparedStatement ins_pstmt = con.prepareStatement(insertSQL);
        PreparedStatement sel_pstmt = con.prepareStatement(selectSQL)) {
        disp(ins_pstmt);
        disp(sel_pstmt);
    } catch (SQLException e) { e.printStackTrace(); }
  }
  private static void disp(PreparedStatement pstmt) throws SQLException {
    boolean isResultSet = pstmt.execute();
    if(isResultSet){
      ResultSet rs = pstmt.getResultSet();
      rs.next();
      System.out.println("åüçıåãâ  : " + rs.getString(1));
    }else{
      int count = pstmt.getUpdateCount();
      System.out.println("çXêVçsêî : " + count);
    }
  }
}
