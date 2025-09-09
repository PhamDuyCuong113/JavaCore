package CodePtit;

import java.util.Scanner;

public class J03008 {
    public static String Solve(String s)
    {
        int l = 0, r = s.length() - 1;
        while (l <= r)
        {
            if (s.charAt(l) != s.charAt(r)) return "NO";
            if (s.charAt(l)!= '2' && s.charAt(l)!= '3'&& s.charAt(l)!= '5'&& s.charAt(l)!= '7' ) return "NO";
            l++; r--;
        }
        
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
