package CodePtit;

import java.util.Scanner;

public class J04008 {
    static class Point{
        double x,y;
        Point(){
            this.x=this.y= 0.0;
        }
        Point(double x, double y){
            this.x = x; this.y = y;
        }
        public double distance(Point a, Point b){
            return Math.sqrt((a.x-b.x)*(a.x - b.x) + (a.y-b.y)*(a.y-b.y));
        }
        public String Solve(Point a, Point b, Point c){
            double c1 = distance(a, b);
            double c2 = distance(a, c);
            double c3 = distance(c, b);
            double res = c1 + c2 + c3;
            if (c1 + c2 > c3 && c2 + c3 > c1 && c1 + c3 > c2) return String.format("%.3f", res);
            else return "INVALID";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0)
        {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            Point p = new Point();
            System.out.println(p.Solve(a, b, c));
        }
        sc.close();
    }
}
