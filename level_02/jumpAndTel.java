package level_02;

public class jumpAndTel {
	public int solution(int n) {
		int answer = 0;
		
		while(n != 0) {
			if(n % 2 == 0) {
				n /= 2;
			}else {
				n -= 1;
				answer++;
			}
		}
		return answer;
	}
}