package CodePtit;

import java.util.*;

public class J05033 {
    static class Time{
        int gio;
        int phut;
        int giay;

        Time(int h, int m, int s)
        {
            gio = h;
            phut = m;
            giay = s;
        }
        @Override
        public String toString()
        {
            return gio + " " + phut + " " + giay;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        List<Time> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            a.add(new Time(h, m, s));
        }
        a.sort(Comparator
            .comparingInt((Time t)->t.gio)
            .thenComparingInt(t-> t.phut)
            .thenComparingInt(t->t.giay));

        for (Time t : a)
        {
            System.out.println(t);
        }
        sc.close();
    }
}
