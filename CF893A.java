import java.util.Scanner;
public class CF893A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a,b,c; int f,s;
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c= sc.nextInt();

            f=a+(c+1)/2;
            s=b+c/2;

            if(f>s) System.out.println("First");
            else System.out.println("Second");
        }
    }
}
