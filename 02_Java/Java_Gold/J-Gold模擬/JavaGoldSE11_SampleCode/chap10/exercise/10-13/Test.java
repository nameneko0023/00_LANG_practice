import java.sql.*;

public class Test {
  public static void main(String[] args) {
    String csql = "{call myprocedure(?, ?)}";
    try(Connection con = DbConnector.getConnect();
        CallableStatement cstmt = con.�y   �@   �z(csql)) {
        cstmt.setInt(1, 110000);
        cstmt.�y   �A   �z(2, java.sql.Types.BIGINT); 
        cstmt.execute(); 
        int result = cstmt.getInt(2);
        System.out.println(result);
    } catch (SQLException e) { e.printStackTrace(); }
  }
}

