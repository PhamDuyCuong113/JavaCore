package CodePtit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static int compare(String a, String b) {
        if (a.length() == b.length()) return a.compareTo(b);
        else return a.length() - b.length();
    }

    static String stripLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') i++;
        return s.substring(i);
    }

    public static String subtract(String a, String b) {
        StringBuilder res = new StringBuilder();
        StringBuilder A = new StringBuilder(a).reverse();
        StringBuilder B = new StringBuilder(b).reverse();

        int carry = 0;
        for (int i = 0; i < A.length(); i++) {
            int x = A.charAt(i) - '0' - carry;
            int y = (i < B.length() ? B.charAt(i) - '0' : 0);
            if (x < y) {
                x += 10;
                carry = 1;
            } else carry = 0;
            res.append(x - y);
        }

        // Xóa số 0 ở cuối (sau đảo lại là đầu)
        while (res.length() > 1 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
            String X = stripLeadingZeros(sc.nextLine());
            String Y = stripLeadingZeros(sc.nextLine());

            int cmp = compare(X, Y);
            String res;

            String maxLen = cmp >= 0 ? X : Y;

            if (cmp == 0) {
                res = "0";
            } else if (cmp > 0) {
                res = subtract(X, Y);
            } else {
                res = subtract(Y, X);
                res = "-" + res;
            }
            BigInteger ans = new BigInteger(res);
            System.out.println(ans);
        
    }
}
