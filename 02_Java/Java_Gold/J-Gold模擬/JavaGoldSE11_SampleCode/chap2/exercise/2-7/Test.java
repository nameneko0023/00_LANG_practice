import java.lang.annotation.*;
class Foo { }

@Inherited
@interface MyAnnot {
  String value() default null; 
  final int num = 10;
  double method() default 10.0;
  Foo getFoo();
}
