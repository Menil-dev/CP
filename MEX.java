import java.util.*;
public class MEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int[] result = new int[testcases];
        for (int i = 0; i < testcases; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int size = sc.nextInt();
            Integer x = sc.nextInt();
            for (int j = 0; j < size; j++) {
                int temp = sc.nextInt();
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
            if (x == 1) {
                Integer answer = 0; int count = 0;
                while (true) {
                    Integer temp = map.getOrDefault(answer, 0);
                    if (temp == 0) {
                        for (Integer key : map.keySet()) {
                            if (map.get(key) != 0) {
                                count = count + map.get(key);
                            }
                        }break;
                    }
                    answer = answer + count;
                    result[i] = answer;
                }
            } else {
                Integer answer = 0;
                while (true) {
                    Integer temp = map.getOrDefault(answer, 0);
                    if (temp == 0) {
                        if (map.getOrDefault(answer % x, 0) == 0) {
                            result[i] = answer.intValue();
                            break;
                        } else {
                            map.put(answer % x, map.get(answer % x) - 1);
                        }
                    } else {
                        map.put(answer, map.get(answer) - 1);
                    }
                    answer = answer + 1;
                }
            }
            for (int z : result) {
                System.out.println(z);
            }
        }
    }
}