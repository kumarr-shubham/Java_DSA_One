package LinkedList;

import java.util.Scanner;
class Node{
    int val; //default value 0
    Node next; //default value null
    Node(int val){
        this.val=val;
    }
}


public class DisplayList {
    public static void displayRec(Node head){
        if(head == null) return;
        displayRec(head.next);
        System.out.print(head.val+" ");//reverse
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next; // VERY IMPORTANT
        }
//        for(Node temp = head;temp != null;temp = temp.next){
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1sc.nextInt(); // head node
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        // display(a);
        // displayRec(a);
        System.out.println(get(a,4));//50
//        Node n = null;
//        n.val = 10;
//        System.out.println(n.val);
//        System.out.println(n.next);
    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
