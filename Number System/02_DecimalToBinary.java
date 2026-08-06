import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int binary = 0;
        int base = 1;

        while (n > 0) {

            int rem = n % 2;

            binary += rem * base;

            base *= 10;

            n /= 2;
        }

        System.out.println(binary);
    }
}
