import java.util.Scanner;

public class SumOfArrays {
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

        int[] ans = new int[Math.max(n1, n2) + 1];
        int i = arr1.length - 1, j = arr2.length - 1, k = ans.length - 1;
        int carry = 0;

        while (k >= 0) {
            int d1 = i >= 0 ? arr1[i] : 0;
            int d2 = j >= 0 ? arr2[j] : 0;
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans[k] = sum;

            i--;
            j--;
            k--;
        }
        System.out.println("val of k is: " + k);
        if (carry > 0) {
            ans[k + 1] = carry;
            // System.out.print(carry);
        }

        for (int idx = 0; idx < ans.length; idx++) {
            if (idx == 0 && ans[idx] == 0)
                continue;
            System.out.println(ans[idx]);
        }

    }
}
