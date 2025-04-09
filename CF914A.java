import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF914A
{
    public static Set<AbstractMap.SimpleEntry<Integer, Integer>> generate(int x, int y,int a,int b)
    {
        Set<AbstractMap.SimpleEntry<Integer, Integer>> set = new HashSet<>();
        set.add(new AbstractMap.SimpleEntry<>(x+a,y+b));
        set.add(new AbstractMap.SimpleEntry<>(x-a,y+b));
        set.add(new AbstractMap.SimpleEntry<>(x+b, y+a));
        set.add(new AbstractMap.SimpleEntry<>(x-b, y+a));
        set.add(new AbstractMap.SimpleEntry<>(x+b, y-a));
        set.add(new AbstractMap.SimpleEntry<>(x-b, y-a));
        set.add(new AbstractMap.SimpleEntry<>(x+a, y-b));
        set.add(new AbstractMap.SimpleEntry<>(x-a, y-b));

        return set;
    }

    public static int countIntersection(Set<AbstractMap.SimpleEntry<Integer, Integer>> set1,
                                        Set<AbstractMap.SimpleEntry<Integer, Integer>> set2) {
        Set<AbstractMap.SimpleEntry<Integer, Integer>> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Retains only the common elements
        return intersection.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (0 < t--)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            int kx=sc.nextInt();
            int ky=sc.nextInt();

            int qx=sc.nextInt();
            int qy=sc.nextInt();

            Set<AbstractMap.SimpleEntry<Integer, Integer>> setk = generate(kx,ky,a,b);
            Set<AbstractMap.SimpleEntry<Integer, Integer>> setq = generate(qx,qy,a,b);

            System.out.println(countIntersection(setk,setq));

        }
    }
}
