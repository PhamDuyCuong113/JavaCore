package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    public static int n;
    public static ArrayList<ArrayList<Integer>> ans;

    public static void Try(int i, Integer[] a, ArrayList<Integer> res){
        if (res.size() >= 2)
        {
            ans.add(new ArrayList<>(res)); ///////////QUAN TRONG
        }
        for (int j = i; j < n; j++)
        {
            if (res.size()> 0){
                if (res.get(res.size()-1) < a[j])
                {
                    res.add(a[j]);
                    Try(j+1, a, res);
                    res.remove(res.size() - 1);
                }
            }
            else 
            {
                res.add(a[j]);
                Try(j+1, a, res);
                res.remove(res.size() - 1);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        Integer[] a= new Integer[n];
        for (int i = 0 ;i < n ;i ++) a[i] = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        ans = new ArrayList<>();
        Try(0,a,res);
        Collections.sort(ans, ( ArrayList<Integer> x,  ArrayList<Integer> y) ->{
                int len = Math.min(x.size(), y.size());
                for (int i = 0; i < len; i++)
                {
                    if (!x.get(i).equals(y.get(i)))
                    {
                        String tmp1 = x.get(i).toString();
                        String tmp2 = y.get(i).toString();
                        return tmp1.compareTo(tmp2);
                    }
                }
            
           return x.size() - y.size();
        });
        for (ArrayList<Integer> x : ans)
        {
            for (Integer y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
