package Strings;

import java.util.Scanner;

public class PalendromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        boolean flag = false;
        while ( i < j){
            flag = false;
            if(str.charAt(i++) == str.charAt(j--)){
                flag = true;
            }else {
                break;
            }

        }

        if(flag == false){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
}
