package chapter16.practice_ex;

public class Hero extends Character {
  // フィールド
  static final String job = "勇者";

  // コンストラクタ
  public Hero(String name) {
    super(name, setHpRndom(200));
  }

  // メソッド
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  @Override
  public String toString() {
    return Hero.job + ":" + this.name + " HP:" + this.hp;
  }
}
