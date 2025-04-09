import java.util.*;
public class CF1016D {

    public static long findElement(int x1,int x2, int y1, int y2, int targetx, int targety)
    {
        if(x2-x1==1)
        {
            if(targetx==x2 && targety==y2) return 2;
            if(targetx==x1 && targety==y1) return 1;
            if(targetx==x2 && targety==y1) return 3;
            else return 4;
        }
        int x=(x2-x1)/2;
        if(targetx>x)
        {
            if(targety>x) return (long)Math.pow(2,2*x-2)+findElement(x,x2,x,y2,targetx-x,targety-x);
            else return (long)Math.pow(2,2*x-1)+findElement(x,x2,y1,x,targetx-x,targety);
        }
        else
        {
            if(targety>x) return (long)(3*Math.pow(2,2*x-2)+(findElement(x1,x,x,y2,targetx,targety-x)));
            else return findElement(x1,x,y1,x,targetx,targety);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            while(0<q--)
            {
                int targetx=sc.nextInt();
                int targety=sc.nextInt();
                System.out.println(findElement(0,(int)Math.pow(2,n),0,(int)Math.pow(2,n),targetx,targety));
            }
        }
    }
}
