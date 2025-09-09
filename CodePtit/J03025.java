import java.util.Scanner;

public class J03025 {
    
    public static String Solve(String s)
    {
       int n = s.length();
       int k = 0;
       for (int i = 0; i <= (n-1) / 2; i++)
       {
            if (s.charAt(i) != s.charAt(n-i-1))
                k++;
       }
       if ((n % 2 == 0 && k == 1) ||( n% 2 == 1 && k <= 1)) return "YES";
       return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt(); sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            System.out.println(Solve(s));
        }
    }
}
