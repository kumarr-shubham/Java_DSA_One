import java.util.*;
public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        //Octal → Decimal
        int decimal = 0;
        int base = 1;
        while(octal > 0){
            int digit = octal % 10;
            decimal += digit * base;
            base *= 8;
            octal /= 10;
        }
        //Decimal → Binary
        int binary = 0;
        base = 1;
        while(decimal > 0){
            int rem = decimal % 2;
            binary += rem * base;
            base *= 10;
            decimal /= 2;
        }
        System.out.println(binary);
    }
}
