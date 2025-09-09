package CodePtit;

import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int a11 = sc.nextInt();
        int a12 = sc.nextInt();
        int b11 = sc.nextInt();
        int b12 = sc.nextInt();
        int c = Math.max(Math.abs(b1 - a1),Math.abs(b2 - a2));
        int d = Math.max(Math.abs(b12 - a12), Math.abs(b11 - a11));
        int e = Math.max(Math.abs(b11 - a1), Math.abs(b12 - a2));
        int f = Math.max(Math.abs(b1 - a11), Math.abs(b2 - a12));
        int g = Math.max(c, d);
        int h = Math.max(e, f);
        int i = Math.max(g, h);
        System.out.println(i*i);
        
        
    }
}
