package level_01;

import java.util.*;

public class smallestNumber {
	public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        int min = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        min = arr[0];
        for( i = 0 ; i < arr.length ; i++){
            if(min > arr[i]) min = arr[i];
        }
        
        for( i = 0 ; i< arr.length ; i ++){
            if(min != arr[i]) list.add(arr[i]);
        }
        answer = new int[list.size()];
        
        for(i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}
