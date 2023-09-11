package chapter16.practice_ex;

public class Cleric extends Character {

  // フィールド
  static final String job = "聖職者";

  // コンストラクタ
  public Cleric(String name) {
    super(name, setHpRndom(100));
  }
  // メソッド

  @Override
  public void attack(Matango m) {}

  @Override
  public String toString() {
    return Cleric.job + ":" + this.name + " HP:" + this.hp;
  }
}
