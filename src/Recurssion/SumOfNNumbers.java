//Print the Sum of the n natural numbers using recursion.
package Recurssion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfn(num));
    }

    static int sumOfn(int num){
        if(num == 1){
            return 1;
        }
        return num + sumOfn(num - 1);
    }
}
