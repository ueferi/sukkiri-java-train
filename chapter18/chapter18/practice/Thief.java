package chapter18.practice;

public class Thief extends Character {
  // フィールド

  // コンストラクタ
  public Thief(String name) {
    super(name, setHpRndom(160));
    job = "盗賊";
  }

  // メソッド
  @Override
  public void attack(Matango m) {}

  @Override
  public String toString() {
    return this.job + ":" + this.name + " HP:" + this.hp;
  }
}
