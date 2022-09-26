import java.sql.*;

class MyResource implements AutoCloseable {
  private String msg;
  public MyResource(String msg) { this.msg = msg; }
  public void close() throws Exception {
    System.out.println("close() : "+ msg);
  }
}
public class Main {
  public static void main(String[] args) {
    try (MyResource obj1 = new MyResource("obj1");
         MyResource obj2 = new MyResource("obj2")) {
      System.out.println("try �u���b�N���̏���");
      throw new SQLException();
    } catch (SQLException e) {
      System.out.println("catch �u���b�N�FSQLException");
    } catch (Exception e) {
      System.out.println("catch �u���b�N�FException");
    } finally {
      System.out.println("finally �u���b�N");
    }
  }
}
