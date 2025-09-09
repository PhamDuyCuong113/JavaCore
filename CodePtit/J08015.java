package CodePtit;

import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt(); long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i< n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long res =0;
            int l = 0, r = n - 1;
            while (l < r)
            {
                long sum = a[l] + a[r];
                if (sum == k)
                {
                    if (a[l] == a[r]) {
                        long cnt = r - l + 1;
                        res += cnt*(cnt-1) /2;
                        break;
                    }
                    else{
                        long cntL = 1, cntR = 1;
                        while (l + 1 < r && a[l+1] == a[l]){
                            cntL++; l++;
                        }
                        while (r- 1 > l && a[r-1] == a[r]){
                            cntR++; r--;
                        }
                        res+= cntL*cntR;
                        l++;r--;
                    }
                }
                else if (sum < k) l++;
                else r--;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
