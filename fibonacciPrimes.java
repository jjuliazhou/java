package unit08;

// find prime fibonacci numbers

public class fibonacciPrimes {

	public static void main(String[] args) {
		int n = 100000;
		int a = 1; // The first two terms in the Fibonacci sequence
		int b = 1;

		// display the primes in the Fibonacci sequence <= n
		
		// generate the terms in the Fibonacci sequence
		int c = a + b;
		while(c<=n) {
            boolean isPrime = true;
			for(int i=2; i<=Math.sqrt(c); i++){
                if(c%i==0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(c);
            }
			
			a = b;
			b = c;
			c = a + b;
		}
		
	}
}