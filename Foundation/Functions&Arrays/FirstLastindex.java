import java.util.Scanner;

public class FirstLastindex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int lo = 0, hi = arr.length - 1, fi = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < data) {
                lo = mid + 1;
            } else if (arr[mid] > data) {
                hi = mid - 1;
            } else if (arr[mid] == data) {
                fi = mid;
                hi = mid - 1;
            }
        }
        System.out.println(fi);

        lo = 0;
        hi = arr.length - 1;
        int li = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < data) {
                lo = mid + 1;
            } else if (arr[mid] > data) {
                hi = mid - 1;
            } else if (arr[mid] == data) {
                li = mid;
                lo = mid + 1;
            }
        }
        System.out.println(li);

    }
}
