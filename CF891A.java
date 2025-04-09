import java.util.Scanner;
public class CF891A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int odd;
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            odd=0;

            for(int j=0;j<n;j++)
            {
                  odd+=sc.nextInt()&1;
            }
            if(odd%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
