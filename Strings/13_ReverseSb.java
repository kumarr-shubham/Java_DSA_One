package Strings;

import java.util.Collections;

public class ReverseSb {
    public static void main(String[] args) {
        String s = "Devesh";
        StringBuilder sb = new StringBuilder(s);
        // Collections.sort(sb); // does not work
        // sb.reverse();
        // int i=0, j=sb.length()-1;
        // while(i <= j){
        //     cIar temp1= sb.charAt(i);|
        //     char temp2 = sb.charAt(j);
        //     sb.setCharAt(i,temp2);
        //     sb.setCharAt(j,temp1);
        //     i++;
        //     j --;
        // }
        System.out.println(sb);
        sb.deleteCharAt(1);
        sb.insert(1,'e');
        sb.delete(3,6); // 3 to 5
        System.out.println(sb);
//        String s = "Aditya";
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        s = sb.toString();
//        System.out.println(s);
    }
}
