package CodePtit;
import java.util.*;

public class J04002 {
    static class HCM{
        private double dai;
        private double rong;
        private String mau;

        public HCM()
        {
            this.dai = 1; this.rong = 1;
        }
        public HCM(double dai, double rong, String mau )
        {
            this.dai = dai; this.rong = rong; this.mau = mau;
        }

        public double getDai()
        {
            return dai;
        }
        public double getRong()
        {
            return rong;
        }
        public String getMau()
        {
            return mau;
        }
        public void setDai(double dai)
        {
            this.dai = dai;
        }
        public void setRong(double rong)
        {
            this.rong = rong;
        }
        public void setMau(String mau)
        {
            this.mau = mau;
        }
        public double CV()
        {
            return dai*2+rong*2;
        }
        public double DT()
        {
            return dai*rong;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
        String mau = sc.next();
    
        if (dai <= 0 || rong <= 0)
        {
            System.out.println("INVALID");
        }
        else 
        {
            HCM res  = new HCM(dai,rong,mau);
            String mauSac = mau.substring(0,1).toUpperCase() + mau.substring(1).toLowerCase();
            System.out.printf("%.0f %.0f %s\n", res.CV(), res.DT(), mauSac);
        }
        sc.close();
    }
}
