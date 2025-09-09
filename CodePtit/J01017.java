package CodePtit;

import java.util.Scanner;

public class J01017 {
    public static boolean  Solve(String s)
    {
        int len = s.length();
        for (int i = 0 ; i < len-1; i++)
        {
            int ok = (s.charAt(i)- '0') - (s.charAt(i+1) - '0');
            if (Math.abs(ok) != 1) return false;
        }
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
