package chapter18;

import java.io.FileWriter;

public class Code18_2 {

  public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("data.txt");
    fw.write("そ");
    fw.write("れ");
    fw.write("で");
    fw.write("は");
    fw.close();
  }

}
