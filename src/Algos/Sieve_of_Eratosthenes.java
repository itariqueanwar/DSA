/*
The sieve of Eratosthenes is one of the most efficient
ways to find all primes smaller than n when n is smaller than 10 million
 */
package Algos;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = SieveOfEratosthenes(n);

        for(int i = 0; i < isPrime.length; i++){
            if (isPrime[i] == true){
                System.out.println(i);
            }

        }
    }

    static boolean[] SieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= n / 2; i++){

            for(int j = 2 * i; j <= n; j += i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
