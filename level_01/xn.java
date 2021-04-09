package level_01;

public class xn {
	public long[] solution(int x, int n) {
		long[] answer = {};
		answer = new long[n];
		long tmp = x;
		
		for(int i = 0 ; i < n ; i++){
			answer[i] = x;
			x += tmp;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			xn x = new xn();
			System.out.println(x.solution(100, 10));
			
	}

}
