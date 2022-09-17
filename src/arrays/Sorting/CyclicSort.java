/*
Implementing Cyclic sort.
Note: Cyclic sort is implemented only when the given elements are in range of
1 to N.

Time Complexity -> O(n)
 */

package arrays.Sorting;

import java.util.Scanner;

public class CyclicSort {


    static int[] readArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //Method to Add

    public static void main(String[] args) {
        int[] arr = readArray();
        int n = arr.length;

    }
}
