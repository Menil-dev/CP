import java.util.Scanner;
import java.util.ArrayList;
public class CF851A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            int count=0;
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if(2==sc.nextInt())
                {
                    count++;
                    l.add(i+1);
                }
            }
            if(count==0) System.out.println(1);
            else if((count&1)==1) System.out.println(-1);
            else System.out.println(l.get(l.size()/2-1));
        }
    }
}
