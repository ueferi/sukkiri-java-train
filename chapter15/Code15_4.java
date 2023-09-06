package chapter15;

public class Code15_4 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    // 処理時間計測開始
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      sb.append("Java");
    }
    // 処理時間計測おわり
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");

    String s = sb.toString();

  }

}
