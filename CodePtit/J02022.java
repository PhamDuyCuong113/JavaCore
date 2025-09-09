package CodePtit;

import java.util.Arrays;
import java.util.Scanner;

public class J02022 {
        static int N;
    static int[] a = new int[15];
    static boolean[] used = new boolean[15];

    static void Try(int i) {
        for (int j = 1; j <= N; j++) {
            if (!used[j]) {
                if (i > 1 && Math.abs(j - a[i - 1]) == 1) continue; 
                a[i] = j;
                used[j] = true;
                if (i == N) {
                    for (int k = 1; k <= N; k++) System.out.print(a[k]);
                    System.out.println();
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // số test
        while (T-- > 0) {
            N = sc.nextInt();
            Arrays.fill(used, false);
            Try(1);
            System.out.println();
        }
        sc.close();
    }
}
