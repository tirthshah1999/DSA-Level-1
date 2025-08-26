import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int borrow = 0, pow = 1, ans = 0;
        while (n2 > 0) {
            int d2 = n2 % 10;
            int d1 = n1 % 10;
            n2 = n2 / 10;
            n1 = n1 / 10;
            int diff = (d2 - borrow) - d1;
            if (diff >= 0) {
                borrow = 0;
            } else {
                diff += b;
                borrow = 1;
            }

            ans = ans + (diff * pow);
            pow *= 10;
        }
        return ans;
    }
}
