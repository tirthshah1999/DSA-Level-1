import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int data = 20;
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == data) {
                System.out.println("Found data at position " + mid);
                return;
            } else if (arr[mid] < data) {
                lo = mid + 1;
            } else if (arr[mid] > data) {
                hi = mid - 1;
            }
        }
        System.out.println("Data not found " + -1);
    }
}
