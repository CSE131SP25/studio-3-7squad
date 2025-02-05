package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in); //SCANNER (calling in)
	int n = 0;

	System.out.print("To what number do you want to sieve to?  ");
	n = in.nextInt(); 
    boolean[] isPrime = sieveOfEratosthenes(n); //makes array 0 to n

    System.out.println("Prime numbers up to " + n + ":");
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            System.out.print(i + " ");
        }
    }
}

	public static boolean[] sieveOfEratosthenes(int n) { 
	    boolean[] isPrime = new boolean[n + 1];
	    Arrays.fill(isPrime, true); //apply all numbers to be true initially
	    isPrime[0] = false; //excuses 0
	    isPrime[1] = false; //excuses 1
	
	   
	    for (int i = 2; i * i <= n; i++) { //highest i is the sqrt of n
	        if (isPrime[i]) {
	            for (int j = i * i; j <= n; j += i) {
	                isPrime[j] = false;
	            }
	        }
	    }
	    return isPrime;
	}
	}


