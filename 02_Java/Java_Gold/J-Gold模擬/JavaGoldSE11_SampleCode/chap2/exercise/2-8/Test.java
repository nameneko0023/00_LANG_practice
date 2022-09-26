import java.lang.annotation.*;

Åy   á@   Åz
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnot {
  public String value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotPack {
  Åy   áA   Åz
}
class Foo {
  @TestAnnot("abc")
  @TestAnnot("xyz")
  public void method(int a) { }
}