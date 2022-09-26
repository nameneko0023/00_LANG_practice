import java.util.List;
class Foo {
  String str;
  private final List<String> list;
  public Foo(String str, List<String> list) {
    this.str = str;
    this.list = list;
  }
  public String getStr() { return str; }
  public List<String> getList() { return list; }
}
