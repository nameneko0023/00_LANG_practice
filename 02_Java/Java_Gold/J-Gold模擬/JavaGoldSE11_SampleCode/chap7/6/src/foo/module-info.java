// module-info.java 
// fooモジュールの宣言 
module foo {
  exports xlib;
  provides xlib.MyInter with xlib.XTest,xlib.YTest;
}
