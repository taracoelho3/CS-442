package assignment02;

public interface CharQueue {
    char deQueue(); // REMOVES the first char in the queue AND returns that char. 
    //Returns (char)0 of the queue is empty
    void enQueue(char c); //adds char c at the end of the queue
    boolean isEmpty(); //tests if queue is empty
    boolean remove(char c); //Removes first occurrence of char c from anywhere in the Queue, if it is there; it returns true
    //if the char was found and false if it is not in the queue (including the case that the queue is
    //empty).
}
