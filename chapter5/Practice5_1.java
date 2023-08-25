package chapter5;

public class Practice5_1 {

  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {
    String name = "山田";
    int age = 28;
    double height = 190.5;
    char zodiac = '寅';

    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("干支は" + zodiac + "です");
  }

}
