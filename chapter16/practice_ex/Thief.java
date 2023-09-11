package chapter16.practice_ex;

public class Thief extends Character {
  // フィールド
  static final String job = "盗賊";

  // コンストラクタ
  public Thief(String name) {
    super(name, setHpRndom(160));
  }

  // メソッド
  @Override
  public void attack(Matango m) {
  }

  @Override
  public String toString() {
    return Thief.job + ":" + this.name + " HP:" + this.hp;
  }
}
