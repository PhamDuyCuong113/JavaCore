package CodePtit;
import java.util.Scanner;

public class J01011 {
    public static long gcd(long a, long b)
    {
        if (b == 0) return a;
        while (b!= 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b)
    {
        return (a/gcd(a,b)) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = lcm(n,m);
            long b = gcd(n,m);
            System.out.println( a + " "+ b);
        }
    }
}
