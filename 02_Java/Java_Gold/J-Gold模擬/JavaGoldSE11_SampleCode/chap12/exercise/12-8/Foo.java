/*  // A
public class Foo {
  private static final Foo instance;
  protected Foo() { }
  public static Foo getInstance() {
    instance = new Foo();
    return instance;
  }
}
*/

/*  // B
public class Foo {
  private static final Foo instance = new Foo();
  private Foo() { }
  public static Foo getInstance() {
    return instance;
  }
}
*/

/*  // C
public class Foo {
  private static final Foo instance;
  public static Foo getInstance() {
    if(instance == null){
      instance = new Foo();
    }
    return instance;
  }
}
*/

/*  // D
public class Foo {
  public static Foo getInstance() {
    return new Foo();
  }
}
*/

/*  // E
public class Foo {
  private static Foo instance;
  private Foo() { }
  public static synchronized Foo getInstance() {
    if(instance == null){
      instance = new Foo();
    }
    return instance;
  }
}
*/
