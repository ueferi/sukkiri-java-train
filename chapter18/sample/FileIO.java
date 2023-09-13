package chapter18.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {

  public void fileWriter(String str) {
    try {
      // FileWriterオブジェクトを生成
      FileWriter fw = new FileWriter("sample.txt");
      // BufferedWriterオブジェクトを生成
      BufferedWriter bw = new BufferedWriter(fw);
      // ストリームにデータを書き込む
      bw.write(str);
      bw.newLine();
      bw.write(str);
      // ストリームのデータをファイルに書き込む
      bw.flush();
      System.out.println("ファイルに書き込みました。");
      bw.close();
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String fileReader() {

    try {
      FileReader fr = new FileReader("sample.txt");
      // BufferedReaderオブジェクトを生成
      BufferedReader br = new BufferedReader(fr);
      // ストリームからデータを読み込む
      String str = null;
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
      br.close();
      fr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
