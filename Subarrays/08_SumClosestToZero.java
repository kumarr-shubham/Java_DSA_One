import java.util.*;
public class SumClosestToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int closestSum = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        for(int i = 0; i < n; i++){

            int sum = 0;

            for(int j = i; j < n; j++){

                sum += arr[j];

                if(Math.abs(sum) < Math.abs(closestSum)){

                    closestSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Closest Sum = " + closestSum);
        System.out.print("Subarray = ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
