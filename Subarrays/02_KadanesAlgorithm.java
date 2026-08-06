import java.util.*;

public class KadanesAlgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // int start = 0;  //print krne ka tarika
        // int end = 0;
        // int tempStart = 0;

        for(int i = 0; i < n; i++){

            currSum += arr[i];

            if(currSum > maxSum){
                maxSum = currSum;
                // start = tempStart;
                // end = i;
            }

            if(currSum < 0){
                currSum = 0;
                // tempStart = i + 1; 
            }
        }

        System.out.println(maxSum);
        // System.out.println("Maximum Sum = " + maxSum);

        // System.out.print("Subarray = ");

        // for(int i = start; i <= end; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
}
