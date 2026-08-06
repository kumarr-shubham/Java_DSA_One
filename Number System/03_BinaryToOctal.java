import java.util.*;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        //Binary → Decimal
        int decimal = 0;
        int base = 1;
        while(binary > 0){
            int digit = binary % 10;
            decimal += digit * base;
            base *= 2;
            binary /= 10;
        }
        //Decimal → Octal
        int octal = 0;
        base = 1;
        while(decimal > 0){
            int rem = decimal % 8;
            octal += rem * base;
            base *= 10;
            decimal /= 8;
        }
        System.out.println(octal);
    }
}
