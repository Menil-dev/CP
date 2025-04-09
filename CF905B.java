import java.util.Scanner;
public class CF905B
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int[] arr=new int[26];
            for(char c: s.toCharArray())
            {
                arr[c-'a']++;
            }
            int count=0;
            for(int i=0;i<26;i++)
            {
                if(arr[i]%2==1) count++;
            }
            if(count>k+1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
