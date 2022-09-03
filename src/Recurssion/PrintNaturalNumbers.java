//Using Recursion Print natural numbers upto n.

package Recurssion;

import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
    }

    static void printNumber(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printNumber(n - 1);
        System.out.println(n);
    }
}
