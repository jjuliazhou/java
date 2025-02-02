package unit01;
import java.util.*;

/*  
Given two integers L <= R, find the number of times that digit 0 appears in all the integers between L
and R (inclusive). Note that in integer 102, digit 0 appears once, but in integer 1, digit 0 doesn’t appear at all.
Assume the integers L, R are in the range [1, 1000000]. 
*/

public class numZero {
    public static void main(String[] args){
        
        Scanner in2 = new Scanner(System.in);
		int L = in2.nextInt(); 
		int R = in2.nextInt(); 
		in2.close();

        int count2 = 0;
        
        for(int i=L; i<=R; i++){
            for(int x=i; x>0; x=x/10) {
				if(x%10==0) {
					count2++;
				}
			}
        }
        
        System.out.println(count2);
    }
}
