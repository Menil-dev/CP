import java.util.*;
public class CF824B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=1;i<n;i++)
            {
                count+=arr[i]/(2*arr[0]-1);
            }
            System.out.println(count);
        }
    }
}
