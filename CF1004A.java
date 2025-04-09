import java.util.Arrays;
import java.util.Scanner;

public class CF1004A {

    public static boolean find(int[] arr)
    {
        Arrays.sort(arr);

        int freq=1; int temp=arr[0]; int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=temp)
            {
                if(freq==1) return false;
                freq=1;
                temp=arr[i+2];
                i+=2; j=i;
            }
            else if(freq==1)
            {
                freq++;
            }
            else {
                arr[j]++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        boolean[] result=new boolean[testcases];
        int size=0;
        int x;
        for(int i=0;i<testcases;i++)
        {
            x=sc.nextInt();
            int[] arr=new int[x];

            for(int j=0;j<x;j++)
            {
                arr[j]=sc.nextInt();
            }

            if(find(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
