package greedy;

import java.util.Scanner;
public class baek_sugar {
	
	public static int solution(int n) {
		int answer = 0;
		if(n % 5 == 0) return n/ 5;
		else {
			while(n > 0) {
				n = n -3;
				answer++;
				if(n % 5 !=0) continue;
				else {
					answer += n /5;
					return answer;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(solution(n));
	}

}
