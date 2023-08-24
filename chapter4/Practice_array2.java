package chapter4;

public class Practice_array2 {

  public static void main(String[] args) {
    int inputNum = 0;

    System.out.print("4～9の数字を入力してください>");

    inputNum = new java.util.Scanner(System.in).nextInt(); // 数字を入力
    if (inputNum < 4 || inputNum > 9) { // 4～9であるかどうか
      System.out.println("4～9で入力してください");
    }

    if (inputNum >= 4 && inputNum <= 9) {
      for (int i = 1; i <= inputNum; i++) {
        for (int j = 1; j <= inputNum; j++) {
          if (i == 1 || i == inputNum) {
            System.out.print(inputNum);
          } else {
            if (j == 1 || j == inputNum) {
              System.out.print(inputNum);
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.println("");
      }
    }
  }

}
