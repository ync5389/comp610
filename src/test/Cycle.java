package test;


class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class Cycle {

    public static void Test(Node one, Node two){
        // int size = 0;

        while (one != null){
            // size++;
            // System.out.println(size);
            // System.out.println(">" + one.data);
            if(one.next == one.next.next){
                System.out.println("y");
                one.next = null;
            }
            System.out.println("yy");

            one = one.next;
        }


    }

    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(9);
        one.next.next = new Node(1);
        one.next.next.next = new Node(2);
        one.next.next.next.next = one.next.next;

        Node two = new Node(3);
        two.next = new Node(2);
        two.next.next = new Node(4);
  

        Test(one, two);
    }


    
}
