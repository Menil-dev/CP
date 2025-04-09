import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class CF906A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase= sc.nextInt();
        int size;
        for( int i=0; i<testcase; i++)
        {
            size=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<size;j++)
            {
                int temp=sc.nextInt();
                map.put(temp,map.getOrDefault(temp,0)+1);
            }

            if(map.size()>2)
            {
                System.out.println("NO");
            }
            else if(map.size()==2)
            {
                int arr[]=new int[2];
                int j=0;
                for(Integer k:map.keySet())
                {
                    arr[j++]=map.get(k);
                }
                //System.out.println(Arrays.toString(arr));
                if(arr[0]-arr[1]<2 && arr[0]-arr[1]>-2)
                    System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }

    }
}
