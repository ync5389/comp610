package week2;


public class Extend_thread extends Thread{    
    int id;     
    int[] shared_array; 
    boolean done = false; 
    int booked = 0; 
    public Extend_thread(int id, int[] shared_array) { 
        this.id = id;       
        this.shared_array = shared_array; 
    } 

    public void run() { 
        
        for(int i = 0; i < shared_array.length; i++) { 
            book();  
            // System.out.print(id);        
        }
    } 



    public synchronized void book()  { 
        int i = 0; 
        //looking for an empty seat 
        for( ; i < shared_array.length && shared_array[i]!=0;  i++);  
        // check the seat available before booking 
        if(i <shared_array.length ) { 
            shared_array[i] = id; //booking 
            booked++; //increase number of seats booked 
        }         
    } 

} 