import java.util.*;

public class FindSubarrayWithGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(-1);
        map.put(0, temp);

        int prefixSum = 0;

        for(int i = 0; i < n; i++){

            prefixSum += arr[i];

            int need = prefixSum - k;

            if(map.containsKey(need)){

                for(int start : map.get(need)){

                    for(int j = start + 1; j <= i; j++){
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, new ArrayList<>());
            }

            map.get(prefixSum).add(i);
        }
    }
}
