import java.util.*;
public class CountSubarrayXorK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixXor = 0;
        int count = 0;

        map.put(0, 1);

        for(int i = 0; i < n; i++){

            prefixXor ^= arr[i];

            if(map.containsKey(prefixXor ^ k)){
                count += map.get(prefixXor ^ k);
            }

            map.put(prefixXor,
                    map.getOrDefault(prefixXor, 0) + 1);
        }
        System.out.println(count);
    }
}
