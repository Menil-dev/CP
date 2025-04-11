import java.util.Scanner;
public class CFE160A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(0<t--)
        {
            String s=sc.nextLine();
            char[] arr=s.toCharArray();
            int[] freq=new int[2];
            for(char c:arr)
            {
                freq[c-'0']++;
            }
            if(freq[0]==freq[1])
            {
                System.out.println(0);
            }
            else {
                 for(int i=0;i<arr.length;i++)
                 {
                     if(arr[i]=='0' && freq[1]==0)
                     {
                         System.out.println(arr.length-i); break;
                     }
                     else if(arr[i]=='1' && freq[0]==0)
                     {
                         System.out.println(arr.length-i); break;
                     }
                     if(arr[i]=='0') freq[1]--;
                     else freq[0]--;
                 }
            }
        }
    }
}
