package CodePtit;

import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            StringBuilder y = new StringBuilder();
            for (int i = 0; i < a.length - 1; i++)
            {
                String tmp = a[i].toLowerCase();
                y.append(Character.toString(tmp.charAt(0)));
            }
            String duoi = "@ptit.edu.vn";
            String all = a[a.length - 1].toLowerCase() + y;
            if (map.containsKey(all))
            {
                int tansuat = map.get(all);
                map.put(all, tansuat+1);
                System.out.println(all+ (map.get(all)) + duoi);
            }   
            else
            {
                map.put(all, 1);
                System.out.println(all + duoi);
            }
            
        }
    }


}
