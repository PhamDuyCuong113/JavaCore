package CodePtit;

import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int f = 1; f <= t; f++)
        {
            System.out.println("Test " + f + ":");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }

            for (int i = 0; i < n ; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++)
                    {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
             for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(c[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
