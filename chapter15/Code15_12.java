package chapter15;

import java.util.Calendar;
import java.util.Date;

public class Code15_12 {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    // 文字列からDateインスタンスを作る
    c.set(2019, 8, 22, 1, 23, 45);
    c.set(Calendar.MONTH, 9);
    Date d = c.getTime();
    System.out.println(d);
    // Dateインスタンスから文字列を作る
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");

  }

}
