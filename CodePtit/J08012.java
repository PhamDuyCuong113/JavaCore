package CodePtit;

import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<TreeSet<Integer>> ke = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ke.add(new TreeSet<>()); 
        }
        for (int i = 0 ; i < n - 1; i++ )
        {
            int x = sc.nextInt(); int y = sc.nextInt();
            ke.get(x).add(y);
            ke.get(y).add(x);
        }
        int cnt1 = 0, cnt2 = 0;
        boolean ok = true;
        for (int i = 1; i <= n; i++)
        {
            if (ke.get(i).size()!= n-1 && ke.get(i).size()!= 1) ok = false;
            if (ke.get(i).size()== n-1) cnt1++;
            if (ke.get(i).size()== 1) cnt2++;
        }
        if (cnt1 != 1) ok = false;
        if (cnt2!= n-1) ok = false;
        if (ok) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
