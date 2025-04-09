import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;
public class CF1009B
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); long a,b;
        for(int i=0;i<t;i++)
        {
           int n=sc.nextInt();
            PriorityQueue<Long> heap=new PriorityQueue<>();
           for(int j=0;j<n;j++)
           {
               heap.add(sc.nextLong());
           }

           while(heap.size()!=1)
           {
               a=heap.poll();
               b=heap.poll();
               heap.add(a+b-1);
           }
            System.out.println(heap.peek());
        }
    }
}
