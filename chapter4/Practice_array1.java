package chapter4;

public class Practice_array1 {

  public static void main(String[] args) {
    System.out.println("1階ごとの部屋数>");
    int room = new java.util.Scanner(System.in).nextInt();
    System.out.println("階数>");
    int floor = new java.util.Scanner(System.in).nextInt();
    System.out.println("窓を開ける階>");
    int open = new java.util.Scanner(System.in).nextInt();
    
    for (int i = 0; i < floor; i++) {
      for (int j = 0; j < room; j++) {
        if ((floor - open) == i) {
          System.out.print("□");
        } else
          System.out.print("■");
      }
      System.out.println();
    }
  }

}
