package CodePtit;

import java.util.Scanner;

public class J02020 {
    static int n, k;
    static int[] x = new int[20];
    static int cnt = 0;
    public static void Try(int i, int start){
        
        for (int j = start; j <= n - k + i; j++)
        {
            x[i] = j;
            if (i == k)
            {
                for (int t = 1; t <= k; t++)
                {
                    System.out.print(x[t] + (t == k ? " " : ""));
                }
                cnt++;
            } else
            {
                Try(i + 1, j +1 );
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1, 1);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close();
        
    }
}
        