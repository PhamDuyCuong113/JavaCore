package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine().trim();
        StringBuilder tmp = new StringBuilder(s);
        while (tmp.length() > 1) { 
            String s1 = tmp.substring(0, tmp.length()/2);
            String s2 = tmp.substring((tmp.length())/2);

            BigInteger t1 = new BigInteger(s1);
            BigInteger t2 = new BigInteger(s2);

            BigInteger ans = t1.add(t2);

            if (ans.equals(BigInteger.ZERO)) break;
            tmp = new StringBuilder(ans.toString());
            System.out.println(ans);

        }
        sc.close();
    }
}
