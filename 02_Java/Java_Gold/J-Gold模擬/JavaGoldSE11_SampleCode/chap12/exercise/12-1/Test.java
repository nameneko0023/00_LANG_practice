import java.sql.*;

public class Test {
  public static void main(String[] args) {
    try {
      String userId = args[0];
      String password = args[1];
      new Test().check(userId, password);
    } catch(Exception e) { e.printStackTrace();}
  }
  
  
  public void check(String userId, String password) 
                                         throws SQLException {
    Connection connection = DbConnector.getConnect();
    if(connection == null){
      // 接続失敗時のエラー処理、例外スロー
    }
    try {
      String sqlString = "select * from user where user_id='" +
        userId + "' and user_password ='" + password +  "'";  
      System.out.println(sqlString);
      PreparedStatement stmt = connection.prepareStatement(sqlString);
      ResultSet rs = stmt.executeQuery();
      if(!rs.next()){
        throw new SystemException("There is no applicable user.");
      }
      
     // 次の処理にすすむ
    } finally {
      try {
        connection.close();
      } catch (SQLException x) {
        // ハンドラに処理を渡す
      }
    }
  }
}
