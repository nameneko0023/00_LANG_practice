interface A {
  public abstract void method1();
}
interface B extends A { }
abstract class C implements B {
  public abstract void method2();
}
class D extends C {
  public void method2() { }
}
