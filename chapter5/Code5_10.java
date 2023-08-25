package chapter5;

public class Code5_10 {
  // 1つ目のaddメソッド
  public static int add(int x, int y) {
    return x + y;
  }

  // 2つ目のaddメソッド
  public static double add(double x, double y) {
    return x + y;
  }

  // 3つ目のaddメソッド
  public static String add(String x, String y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(add(10, 20));// 1つ目のaddメソッドを呼び出し
    System.out.println(add(3.5, 2.7));// 2つ目のaddメソッド
    System.out.println(add("Hello", "World"));// 3つ目のaddメソッド
  }

}
