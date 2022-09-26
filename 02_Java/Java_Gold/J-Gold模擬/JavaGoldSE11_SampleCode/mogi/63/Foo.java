class Foo implements java.io.Serializable {
  transient String data = "taro";
  public void setData(String data) { this.data = data; }
  public String getdData() { return data; }
  public Foo() { this.data = "hana"; }
}
class Bar extends Foo implements java.io.Serializable {
  { this.data = "nao"; }
  public Bar() { this.data = "kei"; }
}
