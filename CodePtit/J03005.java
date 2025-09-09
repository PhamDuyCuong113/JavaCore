package CodePtit;

import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for (int j = 1 ; j < a.length; j++)
            {
                String tmp = a[j].toLowerCase();
                StringBuilder y = new StringBuilder();
                for (int i = 0; i < tmp.length(); i++)
                {
                    if (i == 0) y.append(Character.toUpperCase(tmp.charAt(i)));
                    else y.append(tmp.charAt(i));
                }
                System.out.print(y + (j == a.length - 1 ? ", " : " "));
            }
            System.out.println(a[0].toUpperCase());

        }

    }
}