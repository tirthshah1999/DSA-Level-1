import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int ans = 0;
        int mult = 1;
        while (n > 0) {
            int q = n / 10;
            int r = n % 10;
            ans = ans + (r * mult);
            mult = mult * b;
            n = n / 10;
        }
        return ans;
    }
}
