package CodePtit;

import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for (String x : a)
            {
                String tmp = x.toLowerCase();
                StringBuilder y = new StringBuilder();
                for (int i = 0; i < tmp.length(); i++)
                {
                    if (i == 0) y.append(Character.toUpperCase(tmp.charAt(i)));
                    else y.append(tmp.charAt(i));
                }
                System.out.print(y + " ");
            }
            
            System.out.println();
        }

    }
}