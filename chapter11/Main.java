package chapter11;

public class Main {
  public static void main(String[] args) {
    Matango m = new Matango();
    Dancer d = new Dancer();
    d.name = "ダンサー";
    d.dance();
    d.attack(m);
  }

}
