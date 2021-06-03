package search;

import java.util.*;


public class sequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		if(n < 100) answer = n;
		else {
			answer += 99;
			for(int i = 100; i <= n ; i++) {
				int h = i / 100;
				int t = (i%100)/10;
				int o = (i%100)%10;
				if((h-t) == (t-o)) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}

}
