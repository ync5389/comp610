package week4;

public class Stack<E> {
    private final int INITAL_CAPACITY = 200;
    private int numElements;
    private E[] elements;
    public Stack() {
        numElements = 0;
        elements = (E[]) (new Object[INITAL_CAPACITY]);
    }

    public boolean push(E object){
        
        while (numElements < INITAL_CAPACITY){

            // Queue<E> test  = new Queue<> ();
            // test.next = head;
            // head = test;
            elements [numElements++] = object;
            return true;
        }
        return false;
    }

    public boolean isEmpty (){
        return numElements == 0;
    }

}