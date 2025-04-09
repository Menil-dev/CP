import java.util.*;
public class CF894B
{
    public static void find(int[] arr,int n)
    {
        List<Integer> ans=new ArrayList<>();
        ans.add(arr[0]);
        int j=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                ans.add(arr[i]);
                ans.add(arr[i]);
            }
            else ans.add(arr[i]);
        }

        System.out.println(ans.size());
        for(Integer k: ans)
        {
            System.out.print(k+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            find(arr,n);
        }
    }
}
