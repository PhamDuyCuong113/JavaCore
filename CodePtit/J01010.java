package CodePtit;
import java.util.Scanner;

public class J01010 {
     public static void Solve(String s) {
        int len  = s.length();
        char[] f = new char[len];
        boolean check = false;
        int cnt = 0;
        for (int i = 0 ; i < len; i++){
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9')
            {
                check = true;
                break;
            }
            else {
              
                if (s.charAt(i) == '0')
                {
                     f[i] = '0';
                     cnt++;
                }
                else if (s.charAt(i) == '1') f[i] = '1'; 
                else if (s.charAt(i) == '8') f[i] = '0';
                else if (s.charAt(i) == '9') f[i] = '0';  
            }
        }
        if (check == true) System.out.println("INVALID");
        else if (cnt == len)
        {
            System.out.println("INVALID");
        }
        else{
            StringBuilder tmp = new StringBuilder();
            for (int i = 0 ; i < len; i++) {
                tmp.append(f[i]);
            }
            long res = Long.parseLong(tmp.toString());
            if (res == 0) System.out.println("INVALID");
            else
                System.out.println(res);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            Solve(s);
        }
    }
}
