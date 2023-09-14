package chapter18.practice;

import java.util.ArrayList;

public class Main {

  public static String setName() {
    System.out.println("追加するキャラクターの名前を入力してください。");
    return new java.util.Scanner(System.in).nextLine();
  }

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    ArrayList<Character> characters = new ArrayList<>();
    while (true) {
      System.out.println("1:キャラクターの追加 2:現在のキャラクターを表示\n3:save 4:load 9:終了");
      int command = new java.util.Scanner(System.in).nextInt();
      FileIO fio = new FileIO();
      if (command == 9)
        break;
      switch (command) {
        case 1:
          System.out.println("追加するキャラクターの職業を選んでください。");
          System.out.println("1:勇者 2:盗賊 3:魔法使い 4:聖職者");
          int select = new java.util.Scanner(System.in).nextInt();
          switch (select) {
            case 1:
              characters.add(new Hero(setName()));
              break;
            case 2:
              characters.add(new Thief(setName()));
              break;
            case 3:
              characters.add(new Wizard(setName()));
              break;
            case 4:
              characters.add(new Cleric(setName()));
              break;
          }
          break;
        case 2:
          if (characters.size() <= 0) {
            System.out.println("まだ誰も登録されていません。");
            break;
          }
          for (Character c : characters) {
            System.out.println(c);
          }
          break;
        case 3:
          fio.fileWriter(characters);
          System.out.println("セーブしました。");
          break;
        case 4:
          characters = fio.fileReader();
          System.out.println("ロードしました。");
          break;
      }
    }
  }

}
