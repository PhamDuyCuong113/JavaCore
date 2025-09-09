package CodePtit;
import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    
    public static boolean Solve(int[] a)
    {
        int n = a.length;
        long[] arr = new long[n];
        for (int i = 0 ; i < n; i++)
        {
            arr[i] = (long)a[i] * a[i];
        }
        Arrays.sort(arr);
        for (int k = n- 1; k >= 2; k--)
        {
            int l = 0; int r=  k-1;
            while (l < r)
            {
                long sum = arr[l] + arr[r];
                if (sum == arr[k])
                {
                    return true;
                }
                else if (sum < arr[k]) l++;
                else r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            if (Solve(a)) System.out.println("YES");
            else System.out.println("NO");

        }
    }


}
