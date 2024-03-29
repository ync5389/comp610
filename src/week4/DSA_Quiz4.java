package week4;

import java.util.Scanner;

class Node {
    char data;
    Node next;
    Node(char c) {
        data = c;
        next = null;
    }
}

public class DSA_Quiz4 {
    public static void main(String[] args) {
        String input = "ABA";
        Scanner myScanner = new Scanner(System.in);
        while (true)    {
            input = myScanner.nextLine();
            System.out.println(palindromeEvaluator(input));
        }
    }

    public static boolean palindromeEvaluator(String input){
        // ...19 lines 
        Node head = null;

        for (char c : input.toCharArray()) {
            Node test = new Node(c);
            
            test.next = head;
            head = test;
            // System.err.println(c + "*");

            // Queue<E> test = new Queue<>(c);
            // test.next = head;
            // head = test;
        }
        
        // Stack<Character> stack = new Stack<>();
        StringBuilder stack = new StringBuilder();

        // stack.push(head.data);
        while(head != null){
            stack.append(head.data);
            head = head.next;
        }


        String original = stack.toString();
        String reverse = stack.reverse().toString();
        return original.equals(reverse);
    }




    
}

