package greedy;

import java.util.*;

public class change {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int c = 1000 -n;
		
		while(c > 0) {
			if(c >= 500) {
				answer += c/500;
				c %= 500;
			}else if(c >= 100) {
				answer += c/100;
				c %= 100;
			}else if(c >= 50){
				answer += c/50;
				c %= 50;
			}else if(c >= 10) {
				answer += c/10;
				c %= 10;
			}else if(c >= 5) {
				answer += c/5;
				c %= 5;
			}else {
				answer += c/1;
				c %= 1;
			}
		}

		System.out.println(answer);
		
	}

}
