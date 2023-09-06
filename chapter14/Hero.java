package chapter14;

public class Hero {
  String name;
  int hp;
  static int money;// すべての勇者で1つの財布を共有する

  // public String toString() {
  // return "名前：" + this.name + "/HP" + this.hp;
  // }

//  public boolean equals(Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o instanceof Hero) {
//      Hero h = (Hero) o;
//      if (this.name.equals(h.name)) {
//        return true;
//      }
//    }
//    return false;
//  }

  // 勇者の所持金をランダム設定するメソッド
  public static void setRandomMoney() {
    Hero.money = (int) (Math.random() * 1000);
  }

}
