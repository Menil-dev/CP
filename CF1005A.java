import java.util.*;
public class CF1005A {


    public static int find(String s)
    {
        int ans=0;
        int temp=0;
        int j;
        for(j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='1') break;
        }
        int sum=0; int se=j;
        for(j=j;j<s.length();j++)
        {
            sum+=s.charAt(j)-'0';
        }
        if(sum==s.length()-se && se!=s.length()) return 1;

        for(int i=s.length()-1;i>=0;i--)
        {
            if((s.charAt(i)-'0')!=temp)
            {
                ans++;
                temp^=1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        int size=0;
        for(int i=0;i<testcases;i++)
        {
            size=sc.nextInt();
            String s=sc.next();
            System.out.println(find(s));
        }
    }
}
