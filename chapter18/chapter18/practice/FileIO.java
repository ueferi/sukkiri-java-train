package chapter18.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileIO {

  public void fileWriter(ArrayList<Character> chars) {
    try {
      // FileWriterオブジェクトを生成
      FileWriter fw = new FileWriter("data.txt");
      // BufferedWriterオブジェクトを生成
      BufferedWriter bw = new BufferedWriter(fw);
      // ストリームにデータを書き込む
      for (Character c : chars) {
        bw.write(c.job + "," + c.name + "," + c.hp);
        bw.newLine();
      }
      // ストリームのデータをファイルに書き込む
      bw.flush();
      bw.close();
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public ArrayList<Character> fileReader() {
    ArrayList<Character> characters = new ArrayList<>();
    try {
      FileReader fr = new FileReader("data.txt");
      // BufferedReaderオブジェクトを生成
      BufferedReader br = new BufferedReader(fr);
      // ストリームからデータを読み込む
      String str = null;
      int count = 0;
      while ((str = br.readLine()) != null) {
        String[] charStr = str.split(",");
        switch (charStr[0]) {
          case "勇者":
            characters.add(new Hero(charStr[1]));
            break;
          case "盗賊":
            characters.add(new Thief(charStr[1]));
            break;
          case "魔法使い":
            characters.add(new Wizard(charStr[1]));
            break;
          case "聖職者":
            characters.add(new Cleric(charStr[1]));
            break;
        }
        characters.get(count).hp = Integer.parseInt(charStr[2]);
      }
      br.close();
      fr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return characters;
  }
}
