
package week5;



public class DSA_Quiz5 {
    static int size = 5;
    static String[] record = new String[10];



    public static void main(String[] args) {
    // TODO code application logic here
        String[] data = {"a", "b", "c", "d", "e"};

        LinkedList test = new LinkedList(data);
        test.printList(false);
        test.toDoublyLinkedList(test.tail);
        // test.printListByLinker():
        // guessNumber();
    }
}



