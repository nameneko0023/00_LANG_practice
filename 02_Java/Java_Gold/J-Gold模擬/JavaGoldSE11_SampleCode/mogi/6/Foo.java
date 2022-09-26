interface Foo {
  static void a() { System.out.println("a()"); }
  default void b() { System.out.println("b()"); }
  
  //static void aa();
  //private static void c() { System.out.println("c()"); } 
  //private void ee();
  //private default void d() { System.out.println("d()"); }
  //private void e() { System.out.println("d()"); }
  //public void f() { System.out.println("f()"); }
}
