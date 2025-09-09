package CodePtit;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03009 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s1 =  sc.nextLine();
            String s2 =  sc.nextLine();
            String[] a = s1.split("\\s+");
            String[] b = s2.split("\\s+");
            TreeSet<String> set2 = new TreeSet<>();
            Set<String> set1 = new LinkedHashSet<>();
            for (String x : b)
            {
                set1.add(x);
            }
            for (String x : a)
            {
                if (set1.contains(x)) continue;
                set2.add(x);
            }
            for (String x : set2)
            {
                System.out.print(x + " ");
            }
            System.out.println();

        }
    }


}
