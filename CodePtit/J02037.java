package CodePtit;

import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            int n = a.length;
            int sl =0 ; int scc = 0;
            for (String x : a)
            {
                if ((x.charAt(x.length()-1) - '0' ) % 2 ==0) scc++;
                else sl++;
            }
            if ((n % 2 == 0 && scc > sl) || (n % 2 == 1 && sl > scc)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
