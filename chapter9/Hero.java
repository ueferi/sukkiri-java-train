package chapter9;

public class Hero {
  // フィールド
  String name;
  int hp;
  Sword sword;

  // コンストラクタ
  public Hero(String name) {
    this.hp = 100;// hpフィールドを100で初期化
    this.name = name;// 引数の値でnameフィールドを初期化
  }

  // 名前を指定しない時のコンストラクタ
  public Hero() {
    this("ダミー");
  }

  // メソッド
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }

}
