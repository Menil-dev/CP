import java.util.Scanner;
public class CF791A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            long n=sc.nextLong();
            if(n<4 || (n%4!=0 && n%4!=2 && n%6!=4 && n%6!=0)) System.out.println(-1);
            else {
                int extra=0;
                if(n%12==4 || n%12==6) extra=1;
                if(n%12==8 || n%12==10) extra=2;
                long min=n/12*2+extra;
                long max=n/12*3+extra;
                if(n%12==2)
                {
                    n-=14;
                    min=3; max=3;
                    min=n/12*2+3;
                    max=n/12*3+3;
                }
                System.out.println(min+" "+max);
            }
        }
    }
}
