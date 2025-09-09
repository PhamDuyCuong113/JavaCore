package CodePtit;

import java.util.Scanner;
import java.util.TreeSet;
public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0 ; i < n; i++)
        {
            for (int j = 0; j< n; j++)
            {
                a[i][j] = sc.nextInt();
            }
            
        }
        TreeSet<Integer>[] set = new TreeSet[n];
        for (int i = 0; i <n; i++)
        {
            set[i] = new TreeSet<>();
        }
        for (int i = 0 ; i < n; i++)
        {
            for (int j = 0; j< n; j++)
            {
                if (a[i][j] == 1)
                {
                    set[i].add(j+1);    
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("List(" + (i+1) + ") = ");
            for (int v : set[i]) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

    }
}
