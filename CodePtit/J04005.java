package CodePtit;

import java.util.*;

public class J04005 {
    static class SV{
        private String hoTen;
        private String ngaySinh;
        private float diem1, diem2, diem3;
        
        public SV(){
            this.hoTen =""; this.ngaySinh = ""; this.diem1 = this.diem2 = this.diem3 = 0.0f;
        }
        public SV(String hoTen, String ngaySinh, float diem1, float diem2, float diem3){
            this.hoTen = hoTen; this.ngaySinh = chuanhoa(ngaySinh); this.diem1 = diem1; this.diem2 = diem2; this.diem3 = diem3;

        }
        public String chuanhoa(String x)
        {
            StringBuilder s = new StringBuilder(x);
            if (s.indexOf("/") == 1) s.insert(0, "0");   // ngày có 1 chữ số
            if (s.lastIndexOf("/") == 3) s.insert(3, "0"); // tháng có 1 chữ số
            return s.toString();
        }
        @Override
        public String toString(){
            float sum = diem1 + diem2 + diem3;
            return hoTen +" "+ ngaySinh +" "+ String.format("%.1f", sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        SV x = new SV(hoTen,ngaySinh,diem1,diem2,diem3);
        System.out.println(x);
        sc.close();
    }
}
