package CodePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class J02025 {
    public static int n,curSum;
    public static ArrayList<Integer> res;
    public static ArrayList<ArrayList<Integer>> ans;
    public static boolean Check(int n)
    {
        if (n <2) return false;
        if (n % 2 == 0 && n > 2) return false;
        for (int i = 2; i*i <= n; i++)
        {
            if (n % i ==0) return false;
        }
        return true;
    }

    public static void Try(int i, Integer[] a, int curSum, ArrayList<Integer> res )
    {
        if (Check(curSum))
        {
            ans.add(new ArrayList<>(res));
        }
        for (int j = i; j < n; j++)
        {
            res.add(a[j]);
            Try(j+1,a,curSum + a[j],res);
            res.remove(res.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0)
        {
            n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)   a[i] = sc.nextInt();
            Arrays.sort(a, (x,y) -> y - x);
            curSum = 0;
            res = new ArrayList<>();
            ans = new ArrayList<>();

            Try(0,a,0,res);

            Collections.sort(ans, (o1, o2) -> {
                int len = Math.min(o1.size(), o2.size());
                for (int i = 0; i < len; i++){
                    if (!o1.get(i).equals(o2.get(i))) return o1.get(i) - o2.get(i);
                }
                return o1.size() - o2.size();
            });
            for (ArrayList<Integer> x : ans)
            {
                for (int y : x)
                {
                    System.out.print(y + " ");
                }
                System.out.println();
            }



        }
    }
}
