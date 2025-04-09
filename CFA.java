import java.util.*;
public class CFA
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();

        int[] arr=new int[256];
        int[] arr2=new int[256];
        for(char c: s.toCharArray())
        {
            arr[c-'A']++;
        }

        for(char c: a.toCharArray())
        {
            arr2[c-'A']++;
        }

        boolean flag=true;
        for(int i=0;i<256;i++)
        {
            if(arr[i]<arr2[i])
            {
                flag=false; break;
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
