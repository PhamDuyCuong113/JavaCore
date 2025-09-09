package CodePtit;
import java.util.*;

public class J03018 {
    static int mod(String s, int m) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            r = (r * 10 + (s.charAt(i) - '0')) % m;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] pow2 = {0, 2, 4, 3, 1}; // index = n mod 4; dùng 4 khi r4 == 0
        int[] pow3 = {0, 3, 4, 2, 1}; // index = n mod 4; dùng 4 khi r4 == 0
        int[] pow4 = {1, 4};          // index = n mod 2; 0->1 (chẵn), 1->4 (lẻ)

        while (T-- > 0) {
            String n = sc.next();          // đọc token, tránh dòng trống
            int r4 = mod(n, 4);
            int r2 = (n.charAt(n.length()-1) - '0') & 1; // n mod 2 từ chữ số cuối

            if (r4 == 0) r4 = 4;

            int ans = (1 + pow2[r4] + pow3[r4] + pow4[r2]) % 5;
            System.out.println(ans);
        }
        sc.close();
    }
}