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
      // �ڑ����s���̃G���[�����A��O�X���[
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
      
     // ���̏����ɂ�����
    } finally {
      try {
        connection.close();
      } catch (SQLException x) {
        // �n���h���ɏ�����n��
      }
    }
  }
}
