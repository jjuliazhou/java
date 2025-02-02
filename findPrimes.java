package unit08;
import java.util.*;

/*
Given an integer n, print all the prime numbers up to n (inclusive) using the sieve of eratosthenes 
*/

public class findPrimes {
    public static void main(String[] args){
        
        int n = 2021;
        boolean[] checkPrimes = new boolean[n+1];
        Arrays.fill(checkPrimes, true);
        
        for(int i=2; i<=n; i++){
            if(checkPrimes[i]){
                for(int j=2*i; j<=n; j+=i){
                    checkPrimes[j] = false;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for(int x=2; x<=n; x++){
            if(checkPrimes[x]){
                primes.add(x);
            }
        }
        System.out.println(primes);

    }
}
