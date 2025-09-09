package CodePtit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();

        for(int te = 1; te <= t; te++){

            Map<Integer,Integer> map = new LinkedHashMap<>();
            int n = sc.nextInt();
            for (int i = 1; i <= n ; i++){
                int x = sc.nextInt();
                if (map.containsKey(x)){
                    int tanSuat = map.get(x);
                    map.put(x, tanSuat+1);
                }
                else map.put(x, 1);
            }
            System.out.println("Test " + te + ":");
          
            for (Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                System.out.println(entry.getKey() + " xuat hien "+ entry.getValue() + " lan");
            }

        }
    }
}
