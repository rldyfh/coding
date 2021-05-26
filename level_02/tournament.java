package level_02;

public class tournament {

	public int solution(int n, int a, int b)
    {
        int answer = 0;
        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while(true){
            if(b % 2 != 0 && a - b == 1){
                answer++;
                break;
            }
            b = (b + 1) / 2;
            a = (a + 1) / 2;
            answer++;
        }
        return answer;
    }
}
