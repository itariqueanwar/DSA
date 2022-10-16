package PriorityQueueAndBinaryHeap;

public class deletingMaxInHEap {

    Integer[] heap;
    int n;

    deletingMaxInHEap(int capacity){
        this.heap = new Integer[capacity + 1];
        this.n = 0;
    }

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }


//    Method to  delete the max element for the Max heap
    public int deleteMax(){
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = null;
        if(n > 0 && (n == (heap.length - 1) / 4)){
            resize(heap.length/2);
        }
        return max;

    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i = 0; i < heap.length; i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void sink(int k){
        while(2 * k <= n){
            int j = 2 * k;
            if(j < n && heap[j] < heap[j + 1]){
                j++;
            }

            if(heap[k] >= heap[j]){
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }


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

    public static void main(String[] args) {
        deletingMaxInHEap del = new deletingMaxInHEap(5);
        del.insert(5);
        del.insert(2);
        del.insert(1);
        del.insert(6);
        del.insert(7);
        System.out.println(del.deleteMax());
        System.out.println(del.deleteMax());
        System.out.println(del.deleteMax());
        System.out.println(del.deleteMax());
    }

}
