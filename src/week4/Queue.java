package  week4;

public class Queue <E>{
    private final int INITAL_CAPACITY = 200;
    private int head;
    private int tail;
    private int numElements;
    private E[] elements;
    public Queue (){
        head = 0;
        tail = 0;
        numElements = 0;
        elements = (E[]) (new Object [INITAL_CAPACITY]);
    }

    public boolean enqueue (E object){
        while (numElements < INITAL_CAPACITY)    {
            elements[(tail++)] = object;
            numElements++;
            System.out.println("zzzz");
            return true;
        }
        return false;
    }
    
    public E dequeue (){
        if (numElements >0){
            numElements--;
            return elements[ (head++)];
        }
        return null;
    }

    public boolean isEmpty (){
        return numElements == 0;
    }
}