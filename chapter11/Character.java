package chapter11;

public abstract class Character {
  // フィールド
  String name;
  int hp;

  // メソッド
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }

  public abstract void attack(Matango m);

}
