package unit01;

/* 
Armstrong number: An integer x of n-digits is called an Armstrong number, if the sum of each digit raised to power n is x itself. 
Find all the 3-digit and 4-digit Armstrong numbers. 
*/

public class armstrong {
    public static void main(String[] args){
        for(int i=100; i<=9999; i++){
            int c = i%10;
            int b = i/10 % 10;
            int a = i/100 % 10;
            if(i>=1000){
                int d = i/1000 % 10;
                if(a*a*a*a + b*b*b*b + c*c*c*c + d*d*d*d == i){
                    System.out.println(i);
                }
            }
            else{
                if(a*a*a + b*b*b + c*c*c == i){
                    System.out.println(i);
                }
            }
        }
    }
}
