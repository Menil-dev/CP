import java.math.BigInteger;
import java.util.*;
public class CF1016B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            BigInteger n=sc.nextBigInteger();
            String number=n.toString(); long sum=0;
            char[] array=number.toCharArray();
            int i;
            for(i=array.length-1;i>=0;i--)
            {
                if(array[i]!='0') break;
                sum++;
            }

            for(int j=i-1;j>=0;j--)
            {
                if(array[j]!='0') sum++;
            }
            System.out.println(sum);
        }
    }
}
