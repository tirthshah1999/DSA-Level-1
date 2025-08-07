import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int op = 1, od = 0, inv = 0;

        while (temp != 0) {
            int r = temp % 10;
            temp = temp / 10;
            od = r;
            inv = inv + (op * (int) Math.pow(10, od - 1));
            op++;
        }

        System.out.println(inv);
    }
}
