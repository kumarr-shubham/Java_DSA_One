import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int octal = 0;
        int base = 1;
        while(n > 0){   //Ye Decimal → Binary jaisa hi hai, bas 2 ki jagah 8 use karna hai.
            int rem = n % 8;
            octal += rem * base;
            base *= 10;
            n /= 8;
        }
        System.out.println(octal);
    }
}
