package test;

class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class Palindrome {

    public static void Test(Node test){
        int size = 0;

        Node one = test;
        while (one != null && one.next != null){
            // size++;
            // System.out.println("> size" + size);
            // System.out.println("> data" + one.data);

            if(one.data == one.next.data){
            System.out.println("yes");
            } 
            one = one.next;
        }



    }

    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(9);
        one.next.next = new Node(1);
        one.next.next.next = new Node(2);
        one.next.next.next.next = new Node(4);

        Node two = new Node(1);
        two.next = new Node(2);
        two.next.next = new Node(2);
        two.next.next.next = new Node(4);
  

        Test(two);
    }


    
}
