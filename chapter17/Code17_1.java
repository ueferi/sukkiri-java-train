package chapter17;

import java.io.FileWriter;

public class Code17_1 {

  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
      fw.close();
    } catch (Exception e) {
      System.out.println("エラーが発生しました");
    }

  }

}
