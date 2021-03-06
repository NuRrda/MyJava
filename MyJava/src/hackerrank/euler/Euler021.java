package hackerrank.euler;

import java.util.*;

/**
 * Created by mdev on 6/14/16.
 */
public class Euler021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            int N = sc.nextInt();
            int[] list = {220, 284, 1184, 1210, 2620, 2924, 5020, 5564, 6232, 6368, 10744, 10856, 12285, 14595, 17296, 18416, 63020, 66928, 66992, 67095, 69615, 71145, 76084, 79750, 87633, 88730};
            int result = 0;
            for (int i = 0; i < list.length; i++) {
                if(list[i]<N){
                    result += list[i];
                }
            }
            System.out.println(result);
        }
    }

    static void cacheIt() {
        Map<Integer, Integer> map = getSumOfDivisorsMap();
        int result = 0;
        List<Integer> finalResult = new ArrayList<>();

        for (Integer key : map.keySet()) {
            if(key.equals(map.get(key)))
                continue;
            if (map.containsKey(map.get(key)) && Objects.equals(map.get(map.get(key)), key)) {
                finalResult.add(key);
                result = result + key;
            }
        }
        System.out.println(result);
        System.out.println(finalResult);
    }

    private static Map<Integer, Integer> getSumOfDivisorsMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        for (int i = 2; i <= 100000; i++) {
            map.put(i, 1);
            int j = 2;
            for (; j*j < i ; j++) {
                if (i % j == 0) {
                    map.put(i, map.get(i) + j + i/j);
                }
            }
            if(j*j == i){
                map.put(i, map.get(i) + j);
            }
        }
        return map;
    }
}
