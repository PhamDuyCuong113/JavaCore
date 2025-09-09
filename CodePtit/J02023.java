package CodePtit;
import java.util.Scanner;

public class J02023
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        sc.close();

      
        if (S == 0) {
            if (N == 1) {
                System.out.println("0 0");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }
        if (S > 9 * N) {
            System.out.println("-1 -1");
            return;
        }

        StringBuilder max = new StringBuilder();
        int rem = S;
        for (int i = 0; i < N; i++) {
            int d = Math.min(9, rem);
            max.append(d);
            rem -= d;
        }

      
        int[] minDigits = new int[N];
        rem = S;
        for (int i = 0; i < N; i++) {
            int start = (i == 0) ? 1 : 0; 
            for (int d = start; d <= 9; d++) {
                int remainAfter = rem - d;
                int maxPossibleForRest = 9 * (N - i - 1);
                if (remainAfter >= 0 && remainAfter <= maxPossibleForRest) {
                    minDigits[i] = d;
                    rem -= d;
                    break;
                }
            }
        }
        StringBuilder min = new StringBuilder();
        for (int d : minDigits) min.append(d);

        System.out.println(min.toString() + " " + max.toString());
    }
}
