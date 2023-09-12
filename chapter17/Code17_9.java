package chapter17;

import java.io.FileWriter;

public class Code17_9 {

  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (Exception e) {
      System.out.println("何らかの例外が発生しました");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (Exception e2) {
          ;
        }
      }
    }

  }

}
