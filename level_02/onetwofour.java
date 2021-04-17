package level_02;

public class onetwofour {
	public String solution(int n) {
        String answer = "";
        int tmp = 0;
        while(n > 0){
            tmp = n % 3;
            n /= 3;
            
            if(tmp == 0){
                n--;
                tmp = 4;
            }
            answer = tmp + answer;
        }

        
        return answer;
    }
}
