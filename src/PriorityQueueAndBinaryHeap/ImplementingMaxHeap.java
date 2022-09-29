package PriorityQueueAndBinaryHeap;

public class ImplementingMaxHeap {
    Integer[] heap;
    int n;
//    constructor for the class ImplementingMaxHeap to define the size of the Array(heap)
    public ImplementingMaxHeap(int capacity){
        this.heap = new Integer[capacity + 1];
        this.n = 0;
    }

//    method to check is the heap is empty or not
    public boolean isEmpty(){
        return n == 0;
    }
//    method to get the size of the heap;
    public int size(){
        return n;
    }

//    Main method or the diver code
    public static void main(String[] args) {
        ImplementingMaxHeap pq = new ImplementingMaxHeap(3);
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
    }
}
