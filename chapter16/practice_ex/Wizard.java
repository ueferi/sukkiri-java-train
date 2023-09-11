package chapter16.practice_ex;

public class Wizard extends Character {
  // フィールド
  static final String job = "魔法使い";

  // コンストラクタ
  public Wizard(String name) {
    super(name, setHpRndom(80));
  }

  // メソッド
  @Override
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }

  public void fireball(Matango m) {
    System.out.println(this.name + "は火の玉を放った！");
    System.out.println("敵に20ポイントのダメージ");
    m.hp -= 20;
    this.mp -= 5;
  }

  @Override
  public String toString() {
    return Wizard.job + ":" + this.name + " HP:" + this.hp;
  }
}
