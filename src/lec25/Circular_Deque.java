package lec25;
import java.util.*;
public class Circular_Deque {
    int []A;
    int front;
    int rear;
    int size;
    public Circular_Deque(int k) {
        A=new int[k];
        front=0;
        rear=-1;
        size=0;
    }
    public boolean insertFront(int value) {
        if(isFull())
        {
            return false;
        }
        if(isEmpty())
        {
            front=0;
            rear=0;
        }
        else if(front==0)
        {
            front=A.length-1;
        }
        else
        {
            front=(front-1)%A.length;
        }
        A[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull())
        {
            return false;
        }
        int idx=(front+size)%A.length;
        A[idx]=value;
        size++;
        rear=(rear+1)%A.length;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())
        {
            return false;
        }
        front=(front+1)%A.length;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())
        {
            return false;
        }
        rear=(rear-1)%A.length;
        if(rear==-1)
        {
            rear=A.length-1;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty())
        {
            return -1;
        }
        return A[front];
    }
    
    public int getRear() {
        if(isEmpty())
        {
            return -1;
        }
        return A[rear];
    }
    
    public boolean isEmpty() {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==A.length)
        {
            return true;
        }
        return false;
    }
}
