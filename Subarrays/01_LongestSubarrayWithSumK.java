import java.util.*;
public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum - k)){
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }
            if(!map.containsKey(prefixSum))
                map.put(prefixSum, i);
        }
        System.out.println(maxLength);
    }
}
