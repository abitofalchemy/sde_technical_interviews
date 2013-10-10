package projecteuler;

public class prob7 {

	/**
	 * 	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
	 * 	we can see that the 6th prime is 13.

		What is the 10 001st prime number?
	 * @param args
	 */
	public static void main(String[] args) {
		int nthPrime = 10001;
		computeNthPrimeNumber(nthPrime);

	}

	private static void computeNthPrimeNumber(int nthPrime) {
		if (nthPrime < 1) {
			System.out.println("Invalid input");
			System.exit(1);
		} else if ( nthPrime == 1) {
			System.out.println(""+nthPrime);
			System.exit(0);
		}
		int topPrime = nthPrime;
		int current = 2;
		int count   = 0;
		int lastPrime = 2;
		
		while (count < topPrime) {
			System.out.print(".");
		boolean prime = true;
		int top = (int)Math.sqrt(current) + 1;
		for (int i = 2; i < top; i++) {
			if (current % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime) {
			count++;
			lastPrime = current;
		}
		if (current == 2) {
		 current++;
		} else {
			current = current + 2;
		}
		}// ends while
		
		System.out.println();
		System.out.println("Last prime = " + lastPrime);
	}

}
