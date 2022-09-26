import java.io.Serializable;

public class User implements Serializable {
  【   ①   】
  private int id;
  private String name;
  public User(int id, String name) {
    this.id = id; this.name = name;
  }
  public int getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
}
