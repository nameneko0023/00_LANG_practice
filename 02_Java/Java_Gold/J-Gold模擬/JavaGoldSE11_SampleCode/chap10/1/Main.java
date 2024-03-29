// �@ java.sqlパッケージのインポート
import java.sql.*;

public class Main {
  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "SELECT dept_code, dept_name FROM department";
    
    try {
      // �A データベースの指定
      String url = "jdbc:mysql://localhost:3306/golddb" + 
                   "?verifyServerCertificate=false&" +
                   "useSSL=false&serverTimezone=JST" ;
      // �B データベースとの接続
      con = DriverManager.getConnection(url, "root", "training");
      // �C ステートメントの取得
      pstmt = con.prepareStatement(sql);
      // �D SQL文の実行
      rs = pstmt.executeQuery();
      // �E 結果の取得と処理
      while(rs.next()){
        System.out.println("dept_code : " + rs.getInt(1));
        System.out.println("dept_name : " + rs.getString(2));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    // �F 接続のクローズ
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();
      } catch (SQLException e) { e.printStackTrace(); }
    }
  }
}
