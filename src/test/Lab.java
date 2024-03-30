package test;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class Lab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        
        Node record = new Node(1);
        record.next = new Node(1);
        record.next.next = new Node(1);

        Node current = new Node(user);
        System.out.println(current.data + "XxxxxxX");
        
        while (record != null) { 
            System.out.println("yy");
            record = record.next;
        }
        System.out.println(record.data + "XxxxxxX");
            record.next = current;

        

    }


}
