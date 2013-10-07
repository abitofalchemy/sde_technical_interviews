package projecteuler;

import java.math.BigInteger;

public class prob3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//printPrimeNumbersFor(13195);
		printPrimeFactorsFor(600851475143L);
		
		if ( !isPrime(6857) ) 
			System.out.println("Not a prime");
		else
			System.out.println("Is a prime");
		
	}
	

	private static boolean isPrime(long n) {
		if ( n  % 2L == 0 )
			return false;
		for (long i =3L; i*i <= n; i+=2L /* look at the odds */){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	private static void printPrimeFactorsFor(long n) {
		
		if ( n % 2L == 0 )
			System.out.println("[Nota prime]");
		for (long i =3L; i*i <= 600851475143L; i+=2L /* look at the odds */){
			if(n%i==0){
				if ( isPrime(i) ){
					System.out.println(i);
					
				}
					
			}
		}
	}

}
