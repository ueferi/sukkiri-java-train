package chapter14;

public class Main {

  public static void main(String[] args) {
    // Object o1 = new Empty();
    // Object o2 = new Hero();
    // Object o3 = "こんにちは";
    // System.out.println(o2);
    //
    // Empty e = new Empty();
    // String s = new String();
    // System.out.println(s);

    // Hero h1 = new Hero();
    // h1.name = "ミナト";
    // h1.hp = 100;
    // Hero h2 = new Hero();
    // h2.name = "ミナト";
    // h2.hp = 100;
    // if (h1.equals(h2) == true) {
    // System.out.println("同じ内容です");
    // } else {
    // System.out.println("違う内容です");
    // }

    // Hero h1 = new Hero();
    // Hero h2 = new Hero();
    // Hero.money = 100;
    // System.out.println(Hero.money);
    // System.out.println(h1.money);
    // h1.money = 300;
    // System.out.println(h2.money);

    Hero.setRandomMoney();
    System.out.println(Hero.money);
    Hero h1 = new Hero();
    System.out.println(h1.money);
  }

}
