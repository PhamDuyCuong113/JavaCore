import java.util.Scanner;
import java.util.TreeSet;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<Character> set = new TreeSet<>();
        for (int i =0 ; i < s.length(); i++)
        {
            
                set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
