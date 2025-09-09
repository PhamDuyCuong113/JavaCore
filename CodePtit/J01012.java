
package CodePtit;
import java.util.Scanner;
// SO UOC CHIA HET CHO 2 BANG SO UOC CUA N/2
public class J01012 {
    public static int countDiv(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++; // i là ước
                if (i != n / i) cnt++; // n/i là ước khác
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 != 0) System.out.println(0);
            else System.out.println(countDiv(n / 2));
        }
    }
}
