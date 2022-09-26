import java.sql.*;

public class DbConnector {
  public static Connection getConnect() throws SQLException{
    String url = "jdbc:mysql://localhost/golddb";
    String user = "root";
    String passwd = "training";
    Connection con = DriverManager.getConnection(url,user,passwd);
    return con;
  }
}
