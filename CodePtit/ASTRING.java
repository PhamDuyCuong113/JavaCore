package CodePtit;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ASTRING {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            //TRA VE IN HOA IN THUONG
            String s = "28TECH JAVA";
            String t = s.toLowerCase();
            //SO SANH 2 XAU
            String s = "java 28tech";
            String t = "java 28TECH";
            System.out.println(s.compareTo(t));
            System.out.println(s.compareToIgnoreCase(t)); // bo qua in hoa va in thuong
            // TACH XAU CON
            String s = "java 28tech";
            System.out.println(s.substring(5));
            System.out.println(s.subSequence(5, 7));
            // KIEM TRA SU TON TAI TRONG XAU
            String s = "java 28tech";
            System.out.println(s.contains("28tech"));   // TRUE
            // TACH XAU
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                 System.out.println(st.nextToken());
            //CHUYEN SO THANH XAU
            int n = 2804;
            String s = "" + n; // CHUYEN SO THANH XAU
            System.out.println(s);
            System.out.println(Integer.parseInt(s)); // XAU THANH SO
            // BIG INTEGER
            String s1 = "18238128381283812381123123123123";
            String s2 = "192399239192393";
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
            System.out.println(num1.subtract(num2));
            System.out.println(num1.multiply(num2));
            System.out.println(num1.divide(num2));
            }
            ///XOAY XAU KI TU
             String s = "cool";
            
                System.out.println(rotate(s, 1)); // oolc
                System.out.println(rotate(s, 2)); // olco
            }
    }
}
