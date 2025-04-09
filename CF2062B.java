import java.util.*;
public class CF2062B {


    public static boolean find(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<((arr.length-1-i)*2+1) || arr[i]<(2*i+1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        boolean[] result=new boolean[testcases];
        int size=0;
        for(int i=0;i<testcases;i++)
        {
            size=sc.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j]=sc.nextInt();
            }
            if(find(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
