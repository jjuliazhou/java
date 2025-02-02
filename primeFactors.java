package unit08;
import java.util.*;

public class primeFactors{
    public static void main(String[] args){
        
        int n = 30;
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
        ArrayList<Integer> exponents = new ArrayList<>();

        for(int x=2; x<=n; x++){
            if(checkPrimes[x]){
                primes.add(x);
                if(x<=n/2){
                    exponents.add(factors(n, x, 0));
                }
                else{
                    exponents.add(0);
                }
            }
        }
        System.out.println(primes);
        System.out.println(exponents);
        
    }
    public static int factors(int n, int p, int a){
        if(n % p == 0){
            a++;
            return factors(n/p, p, a);
        }
        else{
            return a;
        }
    }
}