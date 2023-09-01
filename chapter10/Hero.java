package chapter10;

public class Hero {
  String name = "ミナト";
  int hp = 100;

  // コンストラクタ
  public Hero() {
    super();
    System.out.println("Heroのコンストラクタが動作");
  }

  // 戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

}
