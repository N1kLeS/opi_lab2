class D extends A {
  public D() {
    m9 = 8;
    m18 = 4;
    m1 = 8;
    m5 = 4;
    m36 = 8L;
    m35 = 1L;
  }
  public void m23() {
    System.out.println("метод m23 в классе D");
    System.out.println(m10[2]);
  }
  public static void m38() {
    System.out.println("метод m38 в классе D");
    System.out.println((m37 - 4));
  }
  public static void m39() {
    System.out.println("метод m39 в классе D");
    System.out.println(m37);
  }
  public static void m26() {
    System.out.println("метод m26 в классе D");
    System.out.println((m37 - 4));
  }
  public static void m7() {
    System.out.println("метод m7 в классе D");
    System.out.println(m37++);
  }
  public void m31(A r) {
    r.m34();
  }
  public void m31(D r) {
    r.m21();
  }
}
