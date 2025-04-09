import java.util.Scanner;
public class codeton7A {
    public static boolean find(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int size;
        int j;
        for (int i = 0; i < testcases; i++) {
            size = sc.nextInt();
            int[] arr = new int[size];
            for (j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            if(find(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
