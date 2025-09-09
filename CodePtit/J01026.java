package CodePtit;

import java.util.Scanner;

public class J01026 {
    public static boolean Check(int n)
    {
        int r = (int)Math.sqrt(n);
        if (r * r == n ) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t--  > 0)
        {
            int n = sc.nextInt();
            if (Check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
