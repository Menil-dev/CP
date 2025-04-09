import java.util.Scanner;
public class CFE139A
{
    public static int round(int n)
    {
        if(n<=10) return n;

        int digits=(int)Math.log10(n)+1;

        if(n==(int)Math.pow(10,digits-1)) return 9+round(n/10);
        return n/(int)Math.pow(10,digits-1)+ round((int)Math.pow(10,digits-1))-1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            System.out.println(round(n));
        }
    }
}
