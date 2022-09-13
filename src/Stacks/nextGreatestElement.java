/*
Given an array of integers. For each elemnt in the array, find its next greater element
in that array.
The next greater elements is the first element towards right which is greater than the
current element.

Example:
Input: arr = {4,7,3,4,8,1}
Output: arr = {7,8,4,8,-1,-1}
 */
package Stacks;

import java.util.Scanner;

public class nextGreatestElement {

    private Node top;
    private int length;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public nextGreatestElement(){
        top = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        int val = top.data;
        top = top.next;
        length--;
        return val;
    }

    public int peek(){
        return top.data;
    }



    public static int[] nextGratestElement(int[] nums){
        int[] result = new int[nums.length];
        nextGreatestElement stack = new nextGreatestElement();

        for(int i = nums.length - 1; i >= 0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= nums[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int[] result = nextGratestElement(nums);
        for(int i : result){
            System.out.print( i + " ");
        }
    }
}
