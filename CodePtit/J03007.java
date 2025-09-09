package CodePtit;

import java.util.Scanner;

public class J03007 {
    public static String Solve(String s)
    {
        int l = 0, r = s.length() - 1;
        if (s.charAt(l) != '8' || s.charAt(r)!= '8') return "NO";
        int sum = 0;
        while (l <= r)
        {
            if (s.charAt(l) != s.charAt(r)) return "NO";
            sum += s.charAt(l) - '0' + (s.charAt(r) - '0');
            l++; r--;
        }
        if (sum % 10!= 0)return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t--> 0)
        {
            String s = sc.nextLine().trim();
            System.out.println(Solve(s));
            
        }
    }
}
