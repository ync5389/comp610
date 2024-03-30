package test;


class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class Delete {

    public static void Test(Node one, int number){
        // int size = 0;

        Node test = one;

        while (one != null){
            // size++;
            // System.out.println("> size" + size);
            // System.out.println("> data" + one.data);

            if(one.next.data != number){
                test.data = one.next.data;
                one = one.next;
            } else if(one.next.data == number) {
                test.data = one.next.next.data;
                one = one.next.next;
            }
            System.out.println("data" + test.data);
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
  

        Test(one, 1);
    }


    
}
