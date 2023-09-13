package chapter18.sample;

public class Main {

  public static void main(String[] args) {
    FileIO fio = new FileIO();
    System.out.println("何か入力してください>>");
    String str = new java.util.Scanner(System.in).nextLine();
    fio.fileWriter(str);
    fio.fileReader();// プロジェクト直下のsample.txtに書き込まれます。
  }

}
