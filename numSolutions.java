package unit01;
import java.util.*;

/*
Given positive integers a, b, c, find the number of integer solutions (x, y) in the range [M, N] for the inequality -c <= a*x + b*y <= c. 
*/

public class numSolutions {
    public static void main(String[] args){

        Scanner in4 = new Scanner(System.in);
        int a = in4.nextInt();
		int b = in4.nextInt();
		int c = in4.nextInt();
		int M = in4.nextInt();
		int N = in4.nextInt();
        in4.close();

        int count4 = 0;

        for(int x=M; x<=N; x++){
            for(int y=M; y<=N; y++){
                if(-c <= a*x && b*y <= c){
                    count4++;
                }
            }
        }
        System.out.println(count4);
    }
}
