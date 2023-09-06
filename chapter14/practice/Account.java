package chapter14.practice;

public class Account {
  String accountNumber;
  int balance;

  // 1.残高と口座番号を表示する文字列メソッド
  public String toString() {
    return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
  }

  // 2.口座番号は等しいか判断する等価判定のメソッド
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Account) {
      Account a = (Account) o;
      String an1 = this.accountNumber.trim();
      String an2 = a.accountNumber.trim();
      if (an1.equals(an2)) {
        return true;
      }
    }
    return false;
  }
}
