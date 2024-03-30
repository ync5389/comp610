package test;

import java.util.Random;
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
        Random ran = new Random(10);

        int prog = ran.ints(1, 1000).findFirst().getAsInt();
        while(true){
            int user = scanner.nextInt();
            Node current = new Node(user);

            if(current.data == prog){
                System.err.println("y");
            } else if(current.data < prog){
                System.err.println("h");
            } else {
                System.err.println("l");
            }
        }
        



        

    }


}
