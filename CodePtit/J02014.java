package CodePtit;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            boolean found = false;
            int curS = 0;
            for (int i = 0; i < n; i++) {
                int left = curS;
                int right = sum - curS - a[i];
                if (left == right) {
                    System.out.println(i + 1); // in theo chỉ số 1-based
                    found = true;
                    break;
                }
                curS += a[i];
            }

            if (!found) System.out.println(-1);
        }
    }
}
