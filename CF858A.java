
import java.util.Scanner;
public class CF858A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a,b,c,d;
        for(int i=0;i<t;i++)
        {
            a= sc.nextInt();
            b= sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();

            if(b>d || a+d-b<c) System.out.println(-1);
            else System.out.println((d-b)+(a+d-b)-c);
        }
    }
}
