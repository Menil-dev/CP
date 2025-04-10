import java.util.*;
public class CF1016D {

    public static long findElement(long x,long y, long size)
    {
        if(size==2)
        {
            if(x==1 && y==1) return 1;
            if(x==2 && y==1) return 3;
            if(x==1 && y==2) return 4;
            return 2;
        }

        if(x>size/2 && y>size/2) return (size/2)*(size/2)+findElement(x-size/2,y-size/2,size/2);
        if(x>size/2) return 2*(size/2)*(size/2)+ findElement(x-size/2,y,size/2);
        if(y>size/2) return 3*(size/2)*(size/2)+ findElement(x,y-size/2,size/2);
        return findElement(x,y,size/2);
    }

    public static void findCoor(long size, long num, long[] coor)
    {
        if(size<=2)
        {
            if(num==1)
            {
                coor[0]++; coor[1]++;
            }
            else if(num==2)
            {
                coor[0]+=2; coor[1]+=2;
            }
            else if(num==3)
            {
                coor[0]+=2; coor[1]++;
            }
            else
            {
                coor[0]++; coor[1]+=2;
            }
            return;
        }

        if(num>3*(size/2*size/2))
        {
            coor[1]+=size/2;
            findCoor(size/2,num-3*(size/2*size/2),coor);
        }
        else if(num>2*(size/2*size/2))
        {
            coor[0]+=size/2;
            findCoor(size/2, num-2*(size/2*size/2),coor);
        }
        else if(num>(size/2*size/2))
        {
            coor[0]+=size/2; coor[1]+=size/2;
            findCoor(size/2,num-(size/2*size/2),coor);
        }
        else {
            findCoor(size/2,num,coor);
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
                String s=sc.next();
                if(s.charAt(0)=='-')
                {
                    long targetx=sc.nextLong();
                    long targety=sc.nextLong();
                    System.out.println(findElement(targetx, targety,(int)Math.pow(2,n)));
                }
                else
                {
                    long target=sc.nextLong();
                    long[] arr=new long[2]; arr[0]=0; arr[1]=0;
                    findCoor((long)Math.pow(2,n),target,arr);
                    System.out.println(arr[0]+" "+arr[1]+" ");
                }
            }
        }
    }
}
