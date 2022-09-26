import java.sql.*;

public class Main {
  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "SELECT field1, field2, field3 FROM mytableA";
    try {
      String url = "jdbc:mysql://localhost:3306/golddb" + 
                   "?verifyServerCertificate=false&" +
                   "useSSL=false&serverTimezone=JST" ;
      con = DriverManager.getConnection(url,"root", "training");
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()){
        java.sql.Date sqlDate = rs.getDate(1);
        java.time.LocalDate localDate = sqlDate.toLocalDate();
        System.out.println("localDate : " + localDate);
        
        java.sql.Time sqlTime = rs.getTime(2);
        java.time.LocalTime localTime = sqlTime.toLocalTime();
        System.out.println("localTime : " + localTime);
        
        java.sql.Timestamp timestamp = rs.getTimestamp(3);
        java.time.LocalDateTime localDateTime = 
                              timestamp.toLocalDateTime();
        System.out.println("localDateTime : " + localDateTime);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();
      } catch (SQLException e) { e.printStackTrace(); }
    }
  }
}
