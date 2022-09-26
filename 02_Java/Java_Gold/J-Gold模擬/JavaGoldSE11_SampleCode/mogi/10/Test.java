/*  A
@FunctionalInterface
interface Test<T> {
  default void equals() { 
      //more code
  }
  void task(T t);
}

/*  B
@FunctionalInterface
interface Test<T> {
  public int bar() throws RuntimeException;
  public String toString() {
    return "";
  }
}
*/

/*  C
@FunctionalInterface
interface Test<T> {
  public static void foo() {
    //more code
  }
  public boolean equals(Object obj);
}
*/

/*  D
@FunctionalInterface
interface Test<T> {
  public void foo();
  public void foo(int a);
}
*/


/*  E
@FunctionalInterface
interface Test<T> {
  public void foo();
  private void bar() {
    //more code
  }
}
*/


/*  F
@FunctionalInterface
interface Test<T> {
  public static void foo();
  private void bar(char[] c) { }
}
*/