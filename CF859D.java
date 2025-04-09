import java.util.Scanner;
public class CF859D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();

            int[] arr=new int[n+1];
            arr[1]=sc.nextInt();
            for(int i=2;i<=n;i++)
            {
                arr[i]=arr[i-1]+sc.nextInt();
            }

            int l,r,k;
            int leftSum=0;
            int rightSum=0;

            for(int i=0;i<q;i++)
            {
                l=sc.nextInt();
                r=sc.nextInt();
                k=sc.nextInt();

                if(l>1) leftSum=arr[l-1];
                if(r<n) rightSum=arr[n]-arr[r];

                if(k%2==0 || (r-l+1)%2==0)
                {
                    if((leftSum+rightSum)%2==0) System.out.println("NO");
                    else System.out.println("YES");
                }
                else
                {
                    if((leftSum+rightSum)%2==0) System.out.println("YES");
                    else System.out.println("NO");
                }
                leftSum=0; rightSum=0;
            }
        }
    }
}
