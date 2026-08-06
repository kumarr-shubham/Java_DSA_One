import java.util.*;
public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int answer = arr[0];

        for(int i = 1; i < n; i++){

            if(arr[i] < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);

            minProduct = Math.min(arr[i], minProduct * arr[i]);

            answer = Math.max(answer, maxProduct);
        }
        System.out.println(answer);
    }
}
