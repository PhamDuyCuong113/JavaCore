package CodePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class J02026 {
    public static int n, k, cnt = 0;
    public static ArrayList<Integer> res;
    public static void Try(int i, Integer[] a, int cnt, ArrayList<Integer> res)
    {
        if (cnt == k) 
        {
            for (int x : res) 
            {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
            
        }
        for (int j = i; j < n; j++)
        {
            res.add(a[j]);
            Try(j + 1, a, cnt + 1, res);
            res.remove(res.size() -1);
        }

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            n = sc.nextInt(); k = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0 ; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            res = new ArrayList<>();
            cnt = 0;
            Try(0,a,0,res);
        }
    }   

}
