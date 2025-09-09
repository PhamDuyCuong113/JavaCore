package CodePtit;

import java.util.Scanner;

public class J02012 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        int cnt = 0;
    
        for (int i = 0 ; i < n ; i++)
        {
            
            int j = cnt - 1;
            while (j >= 0 && b[j] > a[i]){
                b[j+1] = b[j];
                j--;
            }
            cnt++;
            b[j+1] =a[i];
            System.out.print("Buoc " + i +": ");
            for (int k = 0; k < cnt; k++) System.out.print(b[k] + " ");
            System.out.println();
        }
    }
}
