import java.sql.*;

public class Main {
  public static void main(String[] args) {
    String sql = "SELECT dept_code, dept_name FROM department " + 
                 "ORDER BY dept_code";
    try(Connection con = DbConnector.getConnect();
        PreparedStatement pstmt = con.prepareStatement(
                                  sql,
                                  ResultSet.TYPE_SCROLL_INSENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE) ) {
        ResultSet rs = pstmt.executeQuery();
        rs.last();  // �ŏI�s�Ɉړ�
        System.out.println("�Ō�̍s�ԍ� : " + rs.getRow());
        rs.afterLast(); // �ŏI�s�̎��̍s�Ɉړ�
        while(rs.previous()){ // �t�����ɃX�N���[��
          System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
    } catch (SQLException e) { e.printStackTrace(); }
  }
}
