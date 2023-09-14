package chapter18.practice;

public class Cleric extends Character {

  // フィールド

  // コンストラクタ
  public Cleric(String name) {
    super(name, setHpRndom(100));
    job = "聖職者";
  }
  // メソッド

  @Override
  public void attack(Matango m) {}

  @Override
  public String toString() {
    return this.job + ":" + this.name + " HP:" + this.hp;
  }
}
