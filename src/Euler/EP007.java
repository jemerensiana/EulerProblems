/* Euler Problem 007
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */

package Euler;

public class EP007 {
	
	public boolean isPrime(long n)
	{
		long i = 2;
	 
		if (n == 2) {
			return true;	
		}
	 
		while (i <= Math.sqrt(n)) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
	 
		return true;
	}
	
	public String solution() {
		int counter = 0;
		long number = 2;
		
		while (true) {
			if (isPrime(number))
				counter++;
			
			if(counter == 10001)
				break;
			
			number++;
		}
		
		return Long.toString(number);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new EP007().solution();
		System.out.println(result);
	}

}
