package CodePtit;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class J03020 {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> word = new ArrayList<>();
        while (sc.hasNext())
        {
            word.add(sc.next());
        }
        LinkedHashMap<String, Integer> f = new LinkedHashMap<>();
        int maxLen = 0;
        for (String w : word)
        {
            if (isPalindrome(w)) {
                maxLen = Math.max(maxLen, w.length());
                f.put(w, f.getOrDefault(w, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> e : f.entrySet()) {
            if (e.getKey().length() == maxLen) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
