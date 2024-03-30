package test;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class Reverse {

    public static void Test(Node test){
        int size = 0;

        Node one = test;
        List<Integer> arr = new ArrayList<>();

        while (one != null){
            // size++;
            // System.out.println("> size" + size);
            // System.out.println("> data" + one.data);

            arr.add(one.data);
            one = one.next;
            size++;
            System.out.println("arr" + arr);
        }

        List<Integer> rev = new ArrayList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            rev.add(arr.get(i));
        }
        size = 0;

        while (test != null) {
            // System.out.println("size" + size);
            // System.out.println("data" + rev.get(size));
            test.data = rev.get(size);
            size++; 
            System.out.println("data" + test.data);
            test = test.next;

        }


    }

    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(9);
        one.next.next = new Node(1);
        one.next.next.next = new Node(2);
        one.next.next.next.next = new Node(4);

        Node two = new Node(3);
        two.next = new Node(2);
        two.next.next = new Node(4);
  

        Test(one);
    }


    
}
