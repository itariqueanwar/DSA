/*
you have given an integer array of size N which contains numbers from 0 to (N - 2). Each number
is present at least once. That is, if N = 5. the array constitutes values ranging from 0 to 3 and
among these, there is a single integer valuue that is present twice. You need to find and return
that dublicate number present in the array.

Example 1:
Input 0,2,1,3,1
OutPut : 1.

Example 2:
Input: 0,3,1,5,4,3,2
Output: 3.
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class findDuplicate {

    public static int duplicate(int[] nums){
        int i = 0;
        int j = 1;
        Arrays.sort(nums);
        while(j < nums.length - 1){
            if(nums[i] == nums[j]){
                return nums[i];
            }
            i++;
            j++;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i =0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Given Array is : " + Arrays.toString(nums));
        System.out.println("Ans is : " + duplicate(nums));

    }
}
