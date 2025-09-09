package CodePtit;

import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
       
       char[] dp = new char[s.length()];
       StringBuilder tmp = new StringBuilder(s);
       tmp = tmp.reverse();
       tmp.toString();
       dp[0] = tmp.charAt(0);
       for (int i = 1 ; i < tmp.length(); i++)
       {    
            dp[i] = (char)Math.max(dp[i-1], tmp.charAt(i));
       }
       StringBuilder res = new StringBuilder();
       for (int i = 0; i < tmp.length(); i++)
       {
            if (dp[i] == tmp.charAt(i)) res.append(dp[i]);
       }
       res.reverse();
       System.out.println(res.toString());
    }
}
