import java.lang.annotation.*;

�y   �@   �z
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnot {
  public String value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotPack {
  �y   �A   �z
}
class Foo {
  @TestAnnot("abc")
  @TestAnnot("xyz")
  public void method(int a) { }
}