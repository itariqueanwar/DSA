package loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2, num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
//        (condition) ? true : false;
        int big = ((num1 > num2) ? num2 : ((num2 > num3) ? num2 : num3));
        System.out.println(big);

    }
}
