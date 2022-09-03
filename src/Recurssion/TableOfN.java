//Using recursion write a code to print the Table of N.

package Recurssion;

import java.util.Scanner;

public class TableOfN {
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        tablePrint(num);
    }

    static void tablePrint(int num){

        if( count > 10){
            return;
        }

        System.out.println( count * num);
        count++;
        tablePrint(num);
    }
}
