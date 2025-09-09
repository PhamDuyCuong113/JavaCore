package CodePtit;
import java.util.Scanner;

public class J01008 {
    public static void phanTich(int n)
    {
        for (int i = 2; i*i <= n;i++)
        {
            int cnt = 0;
            if (n % i == 0)
            {
                System.out.print(i);
                while (n % i == 0)
                {
                    cnt++;
                    n/=i;
                }
            }
            if (cnt != 0) System.out.print("(" + cnt + ") ");
        }
        if (n > 1) System.out.print(n + "(1)" );
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =  1; i <= t; i++)
        {
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            phanTich(n);
        }
    }
}
