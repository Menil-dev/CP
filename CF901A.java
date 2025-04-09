import java.util.Scanner;
public class CF901A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int temp;
            long sum=0;
            for(int i=0;i<n;i++)
            {
                temp=sc.nextInt();
                if(temp>a-1) sum+=(a-1);
                else sum+=(temp);
            }
            sum+=b;
            System.out.println(sum);
        }
    }
}
