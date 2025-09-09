package CodePtit;
import java.util.*;

public class J04001 
{
    static class Point
    {
        double x,y;

        public Point(double a, double b) 
        {
            x = a; y = b;
        }
        public static double distance(Point a, Point b)
        {
            return (double)Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y - b.y)*(a.y-b.y));
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0)
        {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point a = new Point(x1, y1);
            Point b = new Point(x2, y2);
            double res = Point.distance(a,b);
            System.out.printf("%.4f\n", res);
            
        }
        sc.close();
    }
}
