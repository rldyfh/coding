package search;

import java.util.*;

public class decomposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] arr = String.valueOf(N).toCharArray();
		int answer = 0;
		int sum = 0;
		int start = N - 9*arr.length;
		
		for(int i = start ; i <= N ; i++) {
			sum = i;
			int tmp = i;
			while(tmp > 0) {
				sum += tmp%10;
				tmp /= 10;
			}
			if(sum == N) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}  
}
