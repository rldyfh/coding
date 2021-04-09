package level_01;

import java.util.*;

public class reverseNatureNumber {
	public int[] solution(long n) {
    int[] answer = {};
    
    ArrayList<Integer> list = new ArrayList<>();
    String tmp = String.valueOf(n);
    
    for(int i = tmp.length()-1 ; i >= 0 ;i--){
        list.add(Character.getNumericValue(tmp.charAt(i)));
    }
    answer = new int[list.size()];
    
    for(int i = 0 ; i < answer.length ; i++){
        answer[i] = list.get(i);
    }
    
    return answer;
}
}
