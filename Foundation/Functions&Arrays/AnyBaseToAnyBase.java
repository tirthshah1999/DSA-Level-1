import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int decimalConverted = getValueIndecimal(n, sourceBase);
        int res = getValueInBase(decimalConverted, destBase);

        System.out.println(res);
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

    public static int getValueInBase(int n, int b) {
        int mult = 1;
        int ans = 0;
        while (n != 0) {
            int q = n / b;
            int r = n % b;
            ans = ans + (r * mult);
            mult = mult * 10;
            n = q;
        }

        return ans;
    }

}
