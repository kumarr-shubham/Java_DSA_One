import java.util.*;
public class LongestSubarrayEqual0And1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] == 0)
                prefixSum += -1;
            else
                prefixSum += 1;

            if(map.containsKey(prefixSum)){
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            }
            else{
                map.put(prefixSum, i);
            }
        }
        System.out.println(maxLength);
    }
}
