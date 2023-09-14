package chapter18.practice;

public abstract class Character {
  // フィールド
  String name;
  int hp;
  int mp;
  protected String job;

  // コンストラクタ
  public Character(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  // メソッド
  protected static int setHpRndom(int hp) {
    int rnd = new java.util.Random().nextInt(20) - 10;
    return hp + rnd;
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  public abstract void attack(Matango m);
}
