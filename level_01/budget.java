package level_01;

import.java.util.*;

public class budget {

	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0 ;

        Arrays.sort(d);
        for( int i = 0 ; i < d.length ; i ++){
            if(d[i] + sum > budget ) break;
            else{
              sum += d[i];
              answer++;  
            } 
        }
        
        return answer;
    }
}
