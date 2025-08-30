import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int ceil = Integer.MAX_VALUE, floor = Integer.MIN_VALUE;
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == data) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            } else if (arr[mid] < data) {
                lo = mid + 1;
                floor = arr[mid];
            } else if (arr[mid] > data) {
                hi = mid - 1;
                ceil = arr[mid];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
