package PriorityQueueAndBinaryHeap;

public class InsertionInMaxHeap {

    private Integer[] heap;
    private int n;
    public InsertionInMaxHeap(int capacity){
        this.heap = new Integer[capacity + 1];
        this.n = 0;
    }

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

//    Method to perform insertion in maxHeap.
    public void insert(int x){
        if(n == heap.length - 1){
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

//    Swim method to maintain the heap order.
    public void swim(int k){
        while (k > 1 && heap[k / 2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2; //Traversing to its parent
        }
    }

//    Method to resize the array
    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i = 0; i < heap.length; i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

//    Method to print the Max heap.
    public void print(){
        for(int i = 1; i <=n; i++){
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionInMaxHeap maxHeap = new InsertionInMaxHeap(4);
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(2);
        maxHeap.insert(6);
        maxHeap.insert(1);
        maxHeap.insert(3);
        maxHeap.print();
    }
}
