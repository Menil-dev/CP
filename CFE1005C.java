import java.util.*;

public class CFE1005C
{
    public static int find(int[] arr)
    {
        long ans=0; int temp;
        List<Integer> list=new ArrayList<>();
        int[] two=new int[arr.length];
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                list.add(i);
            }
            else if(arr[i]==2)
            {
                count++;
            }
            else
            {
                for(Integer k:list)
                {
                    temp=two[i-1]-two[k.intValue()];
                    ans+= ((1<<temp)-1)%998244353;
                }
            }
            two[i]=count;
        }
        return (int)(ans%998244353);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        int size=0;
        for(int i=0;i<testcases;i++)
        {
            size=sc.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j]=sc.nextInt();
            }

            System.out.println(find(arr));
        }
    }
}
