package level_01;

import java.util.*;

public class divisor {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int j = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % divisor == 0 ){
                list.add(arr[i]);
            }
        }
        
        if(list.size() == 0 ){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[list.size()];
        Collections.sort(list);
        for(int tmp: list){
            answer[j++] = tmp; 
        }
        
        return answer;
    }
}
