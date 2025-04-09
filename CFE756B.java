import java.util.PriorityQueue;
import java.util.Scanner;
public class CFE756B {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();


            if(k!=1)
            {
                PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->b-a);

                for(int i=0;i<n;i++)
                {
                    heap.add(sc.nextInt());
                }

                long sum=0;
                for(int i=0;i<k+1;i++)
                {
                    sum+=heap.poll();
                }
                System.out.println(sum);
            }
            else
            {
                long[] a = new long[n] ;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong() ;
                }

                long ans = 0 ;
                long mx = 0;
                for (int i = 1; i < n; i++) {
                    mx = Math.max(mx, a[i]) ;
                }
                ans = Math.max(ans, mx + a[0]) ;
                mx = 0 ;
                for (int i = 0; i < n-1; i++) {
                    mx = Math.max(mx, a[i]) ;
                }
                ans = Math.max(ans, mx + a[n-1]) ;

                System.out.println(ans);
            }
        }
    }
}
