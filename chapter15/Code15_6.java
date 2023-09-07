package chapter15;

public class Code15_6 {

  public static void main(String[] args) {
    System.out.println("勇者の名前を入力してください");
    String str = new java.util.Scanner(System.in).nextLine();
    if (isValidPlayerName(str)) {
      System.out.println("ようこそ" + str + "さん");
    } else {
      System.out.println("名前が正しくありません");
    }
  }

  public static boolean isValidPlayerName(String name) {
    return name.matches("[A-Z][A-Z0-9]{7}");
  }

}
