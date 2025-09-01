import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1;
        int tne = n * m, count = 0;
        while (count < tne) {
            // lw
            for (int i = minr; i <= maxr && count < tne; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            // bw
            for (int i = minc; i <= maxc && count < tne; i++) {
                System.out.println(arr[maxr][i]);
                count++;
            }
            maxr--;
            // rw
            for (int i = maxr; i >= minr && count < tne; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            // tw
            for (int i = maxc; i >= minc && count < tne; i--ln) {
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;
        }
    }
}
