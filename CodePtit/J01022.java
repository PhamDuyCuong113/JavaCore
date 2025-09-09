package CodePtit;

import java.util.Scanner;

public class J01022 {
    static long[] f = new long[93];
    public static void Sang()
    {
        f[1] = 1; f[2] = 1;
        for (int i = 3; i < 93; i++)
        {
            f[i] = f[i-2] + f[i-1];
        }

    }
    public static int Solve(int n, long k)
    {
        
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (k > f[n - 2]) return Solve(n-1, k-f[n-2]);
        else return Solve(n-2, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Sang();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Solve(n,k));
        }
    }
}
