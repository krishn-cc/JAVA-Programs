import java.util.*;

public class Merge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            int T = 0, i = 0, m = 0, u = 0, r = 0;

            for (int k = 0; k < 5; k++) {
                char c = s.charAt(k);
                if (c == 'T') T++;
                else if (c == 'i') i++;
                else if (c == 'm') m++;
                else if (c == 'u') u++;
                else if (c == 'r') r++;
                else {
                    T = -1;
                    break;
                }
            }

            if (T == 1 && i == 1 && m == 1 && u == 1 && r == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
