package chapter15;

public class Code15_8 {

  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh]", "X");
    System.out.println(w);// aXc,dXf:gXi
    System.out.printf("製品番号%s-%02d", "SJV", 3);// 製品番号SJV-03

  }

}
