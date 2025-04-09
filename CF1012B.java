import java.util.Scanner;
public class CF1012B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();

            if(a%(x+y)<x) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
