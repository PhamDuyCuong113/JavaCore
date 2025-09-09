package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

public class J02009 {
    static class pair{
        public int fi, se;
        public pair(int a, int b)
        {
            fi = a; se = b;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<pair> a = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            a.add(new pair(sc.nextInt(),sc.nextInt()));
        }
        a.sort((pair x, pair y)->{
                return x.fi - y.fi;
        });
        int finish = 0; 
        for (int i = 0 ; i < n ; i++)
        {
            if (a.get(i).fi >= finish ) finish = a.get(i).fi + a.get(i).se;
            else finish += a.get(i).se;
        }
        System.out.println(finish);
    }
}
