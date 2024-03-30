package week5;

class Node {
        String data;
        Node prev;
        Node next;
        Node(){
                this.prev = null;
                this.next = null;
        }
}

public class LinkedList {
        int size = 0;
        boolean isDoublyLinkedList = false;
        
        Node head;
        Node tail;
        public LinkedList(String[] record){

                Node node = new Node();
                head = node;
                Node current = head;
                node.data = record[0];
                tail = current;
                for(int i = 1; i < record.length; i++){
                        size++;

                        node = new Node();
                        node.data = record[i];
                        node.next = null;
                        node.prev = null;
                        current.next = node;

                        current = current.next;
                }
        };





        public void printList(boolean reversely){
                if (reversely){
                        // printListRevesly(head);
                }else{
                        printList(head);
                }
        }

        private void printList(Node test){
                System.out.println(test.data);
                if (test.next != null){
                        
                // recursive
                        printList(test.next);
                }
        }

        public Node toDoublyLinkedList(Node current) {
                current.prev = null;
                current.next = null;
                // while (current != null) {
                //         System.out.println("yyyy" + current.data);
                //         current = current.next;
                // }
                // System.out.println("n" + current.prev.data);
                // System.out.println("n" + current.next.data);
                return current;
        } 


}
