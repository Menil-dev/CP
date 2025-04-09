import java.util.Scanner;
public class CF849C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 < t--) {
            int i;
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            for (i = 0; i < n; i++) {
                if (arr[i] == arr[n - i - 1]) break;
            }
            if(i!=n) System.out.println(n-i-i);
            else System.out.println(0);
        }
    }
}
