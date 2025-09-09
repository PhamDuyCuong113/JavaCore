package CodePtit;

import java.util.Scanner;

public class J01021 {
    static final int MOD = (int)1e9+7;
    public static long Power(long a,long b)
    {
        if (b == 0) return 1;
        if (b == 1) return a;
        long res = 1;
        while (b > 0)
        {
            if (b % 2 == 1) res = ((res%MOD) * (a%MOD))%MOD;
            a = ((a%MOD) * (a%MOD))%MOD;
            b/=2;

        }
        return res%MOD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a== 0 && b ==0) break;
            else System.out.println(Power(a,b));
            
        }
    }
}
