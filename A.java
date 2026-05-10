class A {
  int m9;
  int m18;
  int m1;
  int m25;
  int m5;
  long m36;
  long m35;
  long m22;
  int[] m32 = {-3, 2, -1, 1, 1};
  int[] m27 = {-2, 1, 2, 3};
  int[] m10 = {-2, -3, -2, 1};
  static int m37;
  static int m14;
  static int m16;
  static int m40;
  static int m11;
  public A() {
    m9 = 2;
    m18 = 7;
    m1 = 3;
    m25 = 8;
    m5 = 0;
    m36 = 9L;
    m35 = 8L;
    m22 = 0L;
  }
  public void m33() {
    System.out.println("метод m33 в классе A");
    System.out.println(m1 << 1);
  }
  public void m23() {
    System.out.println("метод m23 в классе A");
    System.out.println(m5 >> 1);
  }
  public void m34() {
    System.out.println("метод m34 в классе A");
    System.out.println(m1);
  }
  public void m21() {
    System.out.println("метод m21 в классе A");
    System.out.println(m37++);
  }
  public void m3() {
    System.out.println("метод m3 в классе A");
    System.out.println(m10[1] + m10[2]);
  }
  public void m20() {
    System.out.println("метод m20 в классе A");
    System.out.println(m5);
  }
  public static void m38() {
    System.out.println("метод m38 в классе A");
    System.out.println(m40);
  }
  public static void m39() {
    System.out.println("метод m39 в классе A");
    System.out.println((m40 - 3));
  }
  public static void m26() {
    System.out.println("метод m26 в классе A");
    System.out.println(m11);
  }
  public static void m7() {
    System.out.println("метод m7 в классе A");
    System.out.println((m11 - 2));
  }
  public void m31(A r) {
    r.m33();
  }
  public void m31(D r) {
    r.m23();
  }
}
