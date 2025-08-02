import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
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
