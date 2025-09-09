import java.util.Scanner;

public class J03024 {
    public static String Solve(String s){
        int sc = 0, sl = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isAlphabetic(s.charAt(i))) return "INVALID";
            else if (Character.isDigit(s.charAt(i))){
                if ((s.charAt(i) - '0') % 2== 0) sc++;
                else sl++;
            }
        }
        if (sc > sl) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            System.out.println(Solve(s));
        }
    }
}
