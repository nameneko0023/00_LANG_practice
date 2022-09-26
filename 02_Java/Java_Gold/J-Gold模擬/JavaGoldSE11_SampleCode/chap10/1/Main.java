// �@ java.sql�p�b�P�[�W�̃C���|�[�g
import java.sql.*;

public class Main {
  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "SELECT dept_code, dept_name FROM department";
    
    try {
      // �A �f�[�^�x�[�X�̎w��
      String url = "jdbc:mysql://localhost:3306/golddb" + 
                   "?verifyServerCertificate=false&" +
                   "useSSL=false&serverTimezone=JST" ;
      // �B �f�[�^�x�[�X�Ƃ̐ڑ�
      con = DriverManager.getConnection(url, "root", "training");
      // �C �X�e�[�g�����g�̎擾
      pstmt = con.prepareStatement(sql);
      // �D SQL���̎��s
      rs = pstmt.executeQuery();
      // �E ���ʂ̎擾�Ə���
      while(rs.next()){
        System.out.println("dept_code : " + rs.getInt(1));
        System.out.println("dept_name : " + rs.getString(2));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    // �F �ڑ��̃N���[�Y
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();
      } catch (SQLException e) { e.printStackTrace(); }
    }
  }
}
