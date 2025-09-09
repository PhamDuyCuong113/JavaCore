package CodePtit;

import java.util.*;

public class J04004 {
    static class phanSo
    {
        long tu;
        long mau;
        Scanner sc = new Scanner(System.in);

        void Input()
        {
            tu = sc.nextLong();
            mau = sc.nextLong();
        }
        void Output()
        {
            System.out.println(tu + "/" + mau);
        }

        void rutGon()
        {
            long a = tu; long b = mau;
            while (a != 0)
            {
                long x = a; a = b%a; b = x;
            }
            tu/=b; mau/=b;
        }

        phanSo add(phanSo b)
        {
            phanSo c= new phanSo();
            c.tu = tu*b.mau + mau*b.tu;
            c.mau = mau*b.mau;
            c.rutGon();
            return c;
        }
    }
    public static void main(String[] args) {
        phanSo a = new phanSo();
        phanSo b = new phanSo();
        a.Input(); b.Input();
        phanSo c = a.add(b);
        c.Output();
        
    }
}
