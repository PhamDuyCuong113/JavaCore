package CodePtit;

import java.util.*;

public class J04006 {
    static class SV{
        String MSV;
        String hoTen;
        String lop;
        String date;
        float GPA;

        SV(){
            this.MSV = this.hoTen = this.lop= this.date =""; this.GPA =0.0f;  
        }
        SV(String MSV, String hoTen, String lop, String date, float GPA){
            this.MSV = MSV ; this.hoTen = hoTen; this.lop = lop; this.date = chuanhoa(date); this.GPA = GPA;
        }
        public String chuanhoa(String date){
            StringBuilder tmp = new StringBuilder(date);
            if (tmp.indexOf("/") != 2) tmp.insert(0, "0");
            if (tmp.lastIndexOf("/") != 5) tmp.insert(3, "0");
            return tmp.toString();
        }

        @Override
        public String toString(){
            return MSV + " " + hoTen + " " + lop  +" " + date + " " + String.format("%.2f", GPA);

        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String lop = sc.nextLine();
        String date = sc.nextLine();
        float GPA = sc.nextFloat();
        SV x = new SV("B20DCCN001",hoTen,lop,date,GPA);
        System.out.println(x);
        sc.close();
    }
}
