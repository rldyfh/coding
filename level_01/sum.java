package level_01;

public class sum {
	public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b){
            int tmp = a;
            a = b;
            b= tmp;
        }
        
        for(long i = a ; i <= b ; i++){
            answer += i;    
        }
    
        return answer;
    }
}
