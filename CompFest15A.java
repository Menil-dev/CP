import java.util.Scanner;
public class CompFest15A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int temp;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            temp=sc.nextInt();
            if(temp<0) temp*=-1;
            if(min>temp) min=temp;
        }
        System.out.println(min);
    }
}
