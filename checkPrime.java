package unit08;

/*
Given an integer n, check whether or not it is prime
*/

public class checkPrime {
    public static void main(String[] args){

        long n = 2023;
        boolean isPrime = true;
        for(long i=2L; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
        
    }
}
