import java.util.ArrayList;
public class Test {
  //var a = 100;            // �R���p�C���G���[
  //static var b = 100;     // �R���p�C���G���[
  public void method(var data) { // �R���p�C���G���[
    var c = "hello";        // OK
    //var d;                // �R���p�C���G���[
    //var e = null;         // �R���p�C���G���[
    final var f = 100;      // OK
    //var final g = 100;    // �R���p�C���G���[
    var obj = new Foo();    // OK
    var list = new ArrayList<>(); // OK
    for(var i = 0; i < 10; i++){ } // OK
    //var ary1 = {10, 20};    // �R���p�C���G���[
    var ary2 = new int[] {10, 20}; // OK
  }
}
class Foo { }