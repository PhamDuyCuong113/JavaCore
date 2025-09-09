package CodePtit;

import java.util.Scanner;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int l = 0;
            boolean ok = false;
            long sum = 0;
            for (int r = 0; r < n; r++)
            {
                sum+= a[r];
                while ( sum > k && l <= r)
                {
                    sum-= a[l];
                    l++;
                }
                if (sum == k && l <= r)
                {
                    ok = true;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
