public class MultiplyLargeInt_divideandCongcer {
  public static void main(String[] args) {
    String num1 = "11111";
    String num2 = "11111";
    String answer = "";
    System.out.println(num1.substring(0, num1.length() / 2) + " " + num1.substring(num1.length() / 2));
    answer = multiply(num1, num2);
    System.out.println(num1 + " x " + num2 + " = " + answer);
  }

  static String multiply(String a, String b) {
    // c2 = a1*b1
    // c0 = a0*b0
    // c1 = (a1+a0)(b1+b0) - c2 - c0

    // c11 = MULTIPLY((a1+A0)*(b1+b0))
    // c1 = c11-c2 -c0
    if (a.length() == 1 && b.length() == 1) {
      return (Integer.parseInt(a) * Integer.parseInt(b)) + ""; // to string
    }
    int max = Math.max(a.length(), b.length());
    int power = 2;
    for (; power < max; power *= 2)
      ;

    for (int i = a.length(); i < power; i++) {
      a = "0" + a;
    }
    for (int i = b.length(); i < power; i++) {
      b = "0" + b;
    }

    String a1, a0, b1, b0;
    a1 = a.substring(0, a.length() / 2);
    a0 = a.substring(a.length() / 2);

    b1 = b.substring(0, b.length() / 2);
    b0 = b.substring(b.length() / 2);

    String c0, c1, c2, c11, c = "";
    c2 = multiply(a1, b1);
    c0 = multiply(a0, b0);
    c11 = multiply((Integer.parseInt(a1) + Integer.parseInt(a0) + ""),
        (Integer.parseInt(b1) + Integer.parseInt(b0)) + "");
    c1 = (Integer.parseInt(c11) - Integer.parseInt(c2) - Integer.parseInt(c0)) + "";
    c = Integer.parseInt(time10PoweredByI(c2, a.length())) + Integer.parseInt(time10PoweredByI(c1, a.length() / 2))
        + Integer.parseInt(c0) + "";
    return c;
  }

  static String time10PoweredByI(String num, int i) {

    for (int j = 0; j < i; j++) {
      num += "0";
    }
    return num;
  }
}
