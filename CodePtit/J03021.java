import java.util.Scanner;

public class J03021 {
    public static String Check(String s)
    {
        int l = 0,  r = s.length() - 1;
        while (l < r)
        {
            if (s.charAt(l) != s.charAt(r)) return "NO";
            l++; r--;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            String tmp = s.toLowerCase();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < tmp.length(); i++)
            {
                if (tmp.charAt(i) == 'a' || tmp.charAt(i) == 'b'||tmp.charAt(i) == 'c' ) res.append("2");
                else if (tmp.charAt(i) == 'd' || tmp.charAt(i) == 'e'||tmp.charAt(i) == 'f' ) res.append("3");
                else if (tmp.charAt(i) == 'g' || tmp.charAt(i)== 'h'||tmp.charAt(i)== 'i' ) res.append("4");
                else if (tmp.charAt(i) == 'j' || tmp.charAt(i) == 'k'||tmp.charAt(i) == 'l' ) res.append("5");
                else if (tmp.charAt(i) == 'm' || tmp.charAt(i) == 'n'||tmp.charAt(i) == 'o' ) res.append("6");
                else if (tmp.charAt(i) == 'p' || tmp.charAt(i) == 'q'||tmp.charAt(i) == 'r' || tmp.charAt(i)== 's') res.append("7");
                else if (tmp.charAt(i) == 't' || tmp.charAt(i) == 'u'||tmp.charAt(i) == 'v' ) res.append("8");
                else res.append("9");
            }   
            
            System.out.println(Check(res.toString()));
        }
    }
}
