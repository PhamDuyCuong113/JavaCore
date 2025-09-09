package CodePtit;

import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < n ; i++){
            boolean check = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                 if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = true;
                }
            }
            if (check)
            {
                System.out.print("Buoc "+ (cnt+1) + ": ");
                cnt++;
                for(int j = 0; j < n; j++)
                {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }

        }
    }
}
