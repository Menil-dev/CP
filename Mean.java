import java.util.*;
public class Mean
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        int[] result=new int[testcases];
        for(int i=0;i<testcases;i++)
        {
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int answer=arr[0];
            for(int k=1;k<size;k++)
            {
                if(answer+arr[k]<0)
                {
                    answer=(answer+arr[k])/2-1;
                }
                else answer=(answer+arr[k])/2;
            }
            result[i]=answer;
        }
        for(int x:result)
        {
            System.out.println(x);
        }
    }
}
