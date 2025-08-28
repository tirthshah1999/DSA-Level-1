import java.util.Scanner;

public class SubOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] ans = new int[n2];
        int i = arr1.length - 1, j = arr2.length - 1, k = ans.length - 1;
        int borrow = 0;

        while (j >= 0) {
            int d1 = arr2[j];
            int d2 = i >= 0 ? arr1[i] : 0;
            if (d1 - d2 >= 0) {
                ans[k] = (d1 + borrow) - d2;
                borrow = 0;
            } else {
                ans[k] = (d1 + 10 + borrow) - d2;
                borrow = -1;
            }

            i--;
            j--;
            k--;
        }

        // remove leading 0's
        int idx = 0;
        while (idx < ans.length && ans[idx] == 0) {
            idx++;
        }
        // if idx = ans.length means whole difference result is 0 Eg: 2222-2222 = 0
        if (idx == ans.length)
            System.out.println(0);

        while (idx < ans.length) {
            System.out.println(ans[idx]);
            idx++;
        }
    }
}
