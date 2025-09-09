package CodePtit;

import java.util.Arrays;
import java.util.Scanner;

public class J02027 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            long cnt = 0;
            Arrays.sort(a);
            int l = 0;

            for (int r = 0 ; r < n; r++)
            {
                while (a[r] - a[l] >= k){
                    l++;
                }
                cnt += (r - l);
            }
            System.out.println(cnt);
        }
    }
}
