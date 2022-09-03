//Find the power of a using the recursion.
package Recurssion;

import java.util.Scanner;

public class PowerOfA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerOfNumber(num, power));
    }
    static int powerOfNumber(int number, int power){
        if(power == 0){
            return 1;
        }
        return number * powerOfNumber(number, power - 1);
    }
}
