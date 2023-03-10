public class RussianMul {
    public static void main(String[] args) {
        System.out.println(Russian(35, 60));
    }

    public static int Russian(int a, int b) {
        int ans = 0;
        while (b > 0) {
            if ((b & 1) != 0) {
                ans = ans + a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return ans;
    }
}