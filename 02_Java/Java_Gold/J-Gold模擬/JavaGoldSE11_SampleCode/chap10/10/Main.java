import java.sql.*;

public class Main {
  public static void main(String[] args) {
    String csql = "{call myprocedure(?, ?)}";
    try(Connection con = DbConnector.getConnect();
        CallableStatement cstmt =  con.prepareCall(csql)) {
        cstmt.setInt(1, 110000);
        cstmt.registerOutParameter(2, java.sql.Types.BIGINT); 
        cstmt.execute(); 
        int result = cstmt.getInt(2);
        System.out.println(result);
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
