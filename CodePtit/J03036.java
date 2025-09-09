package CodePtit;
import java.util.*;

public class J03036{
       static String rotate(String s, int k) {
        return s.substring(k) + s.substring(0, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) S[i] = sc.next();

        int L = S[0].length();
        int ans = Integer.MAX_VALUE;

        for (int k = 0; k < L; k++) {
            String target = rotate(S[0], k);
            int steps = 0;
            boolean ok = true;

            for (int i = 0; i < N; i++) {
                boolean found = false;
                for (int j = 0; j < L; j++) {
                    if (rotate(S[i], j).equals(target)) {
                        steps += j;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    ok = false;
                    break;
                }
            }

            if (ok) ans = Math.min(ans, steps);
        }

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

}