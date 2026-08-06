import java.util.*;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        int decimal = 0;
        int base = 1;
        while(octal > 0){   //Ye Binary → Decimal jaisa hi hai, bas base = 8 hoga.
            int digit = octal % 10;
            decimal += digit * base;
            base *= 8;
            octal /= 10;
        }
        System.out.println(decimal);
    }
}
