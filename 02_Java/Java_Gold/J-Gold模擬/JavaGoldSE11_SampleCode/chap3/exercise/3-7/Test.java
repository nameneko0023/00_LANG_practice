class Aex extends RuntimeException {
  public Aex(String msg) {
    super(msg);
  }
  public Aex(int code) {
    //more code
  }
}
class Bex extends Aex {
  public Bex() { 
    //more code
  }
  public Bex(String msg) {
    super(msg);
  }
}

