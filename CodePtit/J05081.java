package CodePtit;

import java.util.*;

public class J05081 {
    static int cnt = 0;
    static class matHang
    {
        String ma;
        String name;
        String donVi;
        int giaMua;
        int giaBan;
        int lai;
        matHang(String maMH, String tenMH, String donViMH, int giaMuaMH, int giaBanMH, int laiXuat)
        {
            ma = maMH; name= tenMH; donVi = donViMH; giaMua = giaMuaMH; giaBan = giaBanMH; lai = laiXuat;

        }
        @Override
        public String toString()
        {
            return ma + " " + name + " " + donVi + " " + giaMua + " " + giaBan + " " + lai;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<matHang> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            sc.nextLine();
            String ten = sc.nextLine().trim();
            String donVi = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            String maMH = String.format("MH%03d", i + 1);
            int lai = giaBan - giaMua;
            list.add(new matHang(maMH.toString(), ten, donVi, giaMua, giaBan,lai));
        }
        list.sort((a, b) -> b.lai - a.lai);
        for (matHang t : list)
        {
            System.out.println(t);
        }
        sc.close();
    }
}
