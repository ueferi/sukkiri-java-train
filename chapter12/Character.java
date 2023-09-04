package chapter12;

public abstract class Character {
  String name;
  int hp;

  public void run() {}

  public void attack() {}// 追加

  public abstract void attack(Matango m);
}
