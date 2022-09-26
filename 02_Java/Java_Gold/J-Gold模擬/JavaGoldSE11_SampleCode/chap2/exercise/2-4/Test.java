import java.lang.annotation.*;
@Target({ElementType.FIELD, ElementType.METHOD})
@interface MyAnnot {
}
class Foo {
  @MyAnnot
  int num;
  public void method(@MyAnnot int a) { }
}