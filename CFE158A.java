import java.util.*;
public class CFE158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int size;
        int x; int max;

        for (int i = 0; i < t; i++)
        {
            size = sc.nextInt();
            x= sc.nextInt();
            int[] arr = new int[size];

            for (int j = 0; j < size; j++)
            {
                arr[j] = sc.nextInt();
            }
            max=arr[0];
            for(int j=1;j<size;j++)
            {
                max=max>arr[j]-arr[j-1]?max:arr[j]-arr[j-1];
            }
            max=max>2*(x-arr[arr.length-1])?max:2*(x-arr[arr.length-1]);

            if(arr.length==1)
            {
                max=2*(x-arr[0])>arr[0]?2*(x-arr[0]):arr[0];
            }
            System.out.println(max);
        }
    }
}
