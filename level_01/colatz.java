package level_01;

public class colatz {

	public int solution(int num) {
        int answer = 0;
        int i = 0;
        int cnt = 0;
        int tmp = num;
        
        for(i = 0 ; i< 500 ; i++){
            if( tmp == 1 ) break;
        	
        	else if(tmp % 2 == 0 ){
                tmp /= 2;
                cnt++;
            }
            else if(tmp % 2 != 0){ 
                tmp = tmp*3 +1;
                cnt++;
            }
            
        }
        System.out.println(i);
        if( i == 500) return -1;
        answer = cnt;
        
        
        return answer;
    }
	public static void main(String[] args) {
		colatz c = new colatz();
		
		System.out.println(c.solution(626331));
	}
}
