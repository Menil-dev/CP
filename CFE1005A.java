import java.util.Scanner;

public class CFE1005A
{

    public static boolean find(int[] arr)
    {
        if(arr.length<3) return true;

        for(int i=1;i<arr.length-2;i++)
        {
            if(arr[i-1]==1 && arr[i]==0 && arr[i+1]==1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        int size=0;
        for(int i=0;i<testcases;i++)
        {
            size=sc.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size-2;j++)
            {
                arr[j]=sc.nextInt();
            }
            //System.out.println("Hello");
            //System.out.println(Arrays.toString(arr));

            if(find(arr))
            System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
