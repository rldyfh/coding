package level_02;

import java.util.*;

public class fibo {
	
	public int solution(int n) {
        int answer = 0;
        int n1 = 0;
        int n2 = 1; 
        
        
        for(int i = 2 ; i <= n ; i++){
            answer = (n1+n2) % 1234567;
            n1 = n2;
            n2 = answer; 
        }       
    
        return answer;
    }

}
