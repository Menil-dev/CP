import java.util.Scanner;
public class CF1009C
{
    public static boolean isPow(long n)
    {
        if(n==1) return true;
        if(n%2!=0) return false;
        return isPow(n/2);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long x; long y; boolean flag;
        for(int i=0;i<t;i++)
        {
            x=sc.nextLong();

            if(isPow(x) || isPow(x+1))
            {
                System.out.println(-1); continue;
            }
            else
            {
                long temp=0; long bit=1;
                int k=(int)(Math.log(x)/Math.log(2))+1;

                for(int j=0;j<k;j++)
                {
                    if((bit&x)==0)
                    {
                        temp=temp|bit;
                    }
                    //System.out.println(temp);
                    bit<<=1;
                }
                int bits=1;
                while((bits&x)==0)
                {
                    bits<<=1;
                }
                temp^=bits;
                System.out.println(temp);
            }
        }
        //System.out.println(isPow(4));
    }
}
