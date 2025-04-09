import java.util.Scanner;

public class CF912A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int size; int k;
        for(int i=0; i<t;i++)
        {
            size=sc.nextInt();
            k=sc.nextInt();
            int[] arr=new int[size];

            for(int j=0;j<size;j++)
            {
                arr[j]=sc.nextInt();
            }

            if(k>1)
            {
                System.out.println("YES");
            }
            else
            {
                boolean flag=true;
                for(int z=1;z<size;z++)
                {
                    if(arr[z]<arr[z-1])
                    {
                        System.out.println("NO"); flag=false; break;
                    }
                }
                if(flag) System.out.println("YES");
            }
        }
    }
}
