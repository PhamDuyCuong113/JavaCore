package CodePtit;

import java.util.Scanner;

public class J01018 {
    public static boolean  Solve(String s)
    {
        int len = s.length();
        int sum = 0;
        for (int i = 0 ; i < len-1; i++)
        {
            sum += s.charAt(i)- '0';
            int ok = (s.charAt(i)- '0') - (s.charAt(i+1) - '0');
            if (Math.abs(ok) != 2) return false;
        }
        sum+= s.charAt(len-1)-'0';
        if (sum%10 != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();   
        while (t-- > 0)
        {
            String s = sc.nextLine();
            if (Solve(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }    
}
