package CodePtit;
import java.util.Scanner;

public class J01009 {
    static long[] f = new long[21];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f[1] = 1; f[2] = 1 + 1*2;
        for (int i = 3; i <= 20; i++)
        {
            long res = 1;
            for (int j = 1; j <= i;j++)
            {
                res*=j;
            }
            f[i] = f[i-1] + res;
        }
        int n = sc.nextInt();
        System.out.println(f[n]);
    }
}
