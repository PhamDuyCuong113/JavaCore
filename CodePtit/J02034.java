package CodePtit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int maxVal = a[n - 1];
        Set<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);

        boolean foundMissing = false;
        for (int i = 1; i<= maxVal; i++)
        {
            if (!set.contains(i)) {
                System.out.println(i);
                foundMissing = true;
            }
        }
         if (!foundMissing) System.out.println("Excellent!");
        sc.close();
    }
}
