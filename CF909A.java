import java.util.Scanner;
public class CF909A
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int n;
        for(int i=0; i<testcases;i++)
        {
            n=sc.nextInt();

            if(n%3==0) System.out.println("Second");
            else System.out.println("First");
        }
    }
}
