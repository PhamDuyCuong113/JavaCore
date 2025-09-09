package CodePtit;

import java.util.*;

public class J03017 {
    static int solve(String s) {
        int n = s.length();
        Stack<int[]> st = new Stack<>(); 
        List<int[]> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st.push(new int[]{s.charAt(i), i});
            while (st.size() >= 3) {
                int[] c3 = st.pop();
                int[] c2 = st.pop();
                int[] c1 = st.pop();
                if (c1[0] == '1' && c2[0] == '0' && c3[0] == '0') {
                    intervals.add(new int[]{c1[1], c3[1]});
                } else {
                    st.push(c1);
                    st.push(c2);
                    st.push(c3);
                    break;
                }
            }
        }
        if (intervals.isEmpty()) return 0;

        intervals.sort(Comparator.comparingInt(a -> a[0]));
        int maxLen = 0;
        int curL = intervals.get(0)[0], curR = intervals.get(0)[1];
        for (int i = 1; i < intervals.size(); i++) {
            int l = intervals.get(i)[0], r = intervals.get(i)[1];
            if (l <= curR + 1) {
                curR = Math.max(curR, r);
            } else {
                maxLen = Math.max(maxLen, curR - curL + 1);
                curL = l; curR = r;
            }
        }
        maxLen = Math.max(maxLen, curR - curL + 1);
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
        sc.close();
    }
}
