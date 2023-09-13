package chapter17.practice_ex;

public class Main {

  public static void main(String[] args) {
    int count = 1;
    int total = 0;
    int max = 0;
    int min = 10000;

    System.out.println("テストの点数を100点満点(正数)で入力してください。");

    while (true) {
      System.out.println(count + "人目の点数");
      String score = new java.util.Scanner(System.in).nextLine();
      if (score.equals("end"))
        break;
      int numScore = 0;
      try {
        numScore = Integer.parseInt(score);
        if (numScore > 100 || numScore < 0)
          throw new IllegalArgumentException();
        total += numScore;
        count++;
        if (numScore > max)
          max = numScore;
        if (numScore < min)
          min = numScore;
      } catch (NumberFormatException e) {
        System.err.println("数値ではありません。入力しなおしてください。");
      } catch (IllegalArgumentException e) {
        System.err.println("入力値が範囲外です。");
      }
    }
    System.out.println("最高得点は:" + max);
    System.out.println("最低得点は:" + min);
    System.out.println("平均点は:" + (total / (count - 1)));

  }

}
