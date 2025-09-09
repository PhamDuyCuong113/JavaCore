package CodePtit;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new TreeSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i  = 1; i <= n; i++)
        {
            int x = sc.nextInt();
            set1.add(x);
        }
        for (int i  = 1; i <= m; i++)
        {
            int x = sc.nextInt();
            set1.add(x);
        }
        for (int x : set1){
            System.out.print(x + " ");
        }
    }
}
