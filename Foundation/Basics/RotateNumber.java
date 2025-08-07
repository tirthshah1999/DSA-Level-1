import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;

        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // handling negative case
        if (k < 0) {
            k = k + nod;
        }

        // handling k > n
        k = k % nod;

        int div = 1, mult = 1;
        for (int i = 0; i < nod; i++) {
            if (i < k) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }

        int q = n / div;
        int r = n % div;
        int ans = r * mult + q;
        System.out.println(ans);
    }
}
