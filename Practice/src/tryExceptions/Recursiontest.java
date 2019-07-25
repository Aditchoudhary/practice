package tryExceptions;

public class Recursiontest {
  static int i = 0;

  static void m1() {
    while (i < 10) {
      i++;
      m1();
      System.out.println(i);
    }
    i--;

  }

  public static void main(String[] args) {
    m1();
  }
}
