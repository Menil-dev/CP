import java.util.*;

public class TechTopiaA {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->b-a);
        ArrayList<Integer> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
            int n1=sc.nextInt();
            int n2=sc.nextInt();

            int k=sc.nextInt();
            int m=sc.nextInt();

            int[] arr1=new int[n1];
            int[] arr2=new int[n2];
            for(int i=0;i<n1;i++)
            {
                arr1[i]=sc.nextInt();
            }
            for(int j=0;j<n2;j++)
            {
                arr2[j]=sc.nextInt();
            }
            if(arr1[k-1]<arr2[n2-m]) System.out.println("YES");
            else System.out.println("NO");
    }
}
