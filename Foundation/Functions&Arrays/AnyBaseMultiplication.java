import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2) {
        int ans = 0, pow = 1, carry = 0;
        while (n1 != 0 || carry != 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int product = (d1 * d2) + carry;
            carry = product / b;
            product = product % b;
            ans = ans + (product * pow);
            pow *= 10;
        }
        return ans;
    }

    public static int anyBaseAddition(int b, int n1, int n2) {
        int ans = 0, carry = 0, pow = 1;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int sum = d1 + d2 + carry;
            carry = sum / b;
            sum = sum % b;
            ans = ans + (sum * pow);
            pow *= 10;
        }
        return ans;
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int ans = 0, pow = 1;
        while (n2 != 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int singleProduct = getProductWithSingleDigit(b, n1, d2);
            ans = anyBaseAddition(b, ans, singleProduct * pow);
            pow *= 10;
        }
        return ans;
    }
}
