package level_01;

import java.util.*;

public class same_number {
	
	    public int[] solution(int []arr) {

	        int j =0 ;
	        List<Integer> list = new ArrayList<>();
	        
	        list.add(arr[0]);
	        for(int i = 0 ; i < arr.length - 1 ; i++){
	            if(arr[i] != arr[i+1]){
	                list.add(arr[i+1]);
	            }
	        }
	        
	        int[] answer = new int[list.size()];
	        
	        for(int tmp: list){
	            answer[j++] = tmp;
	        }
	        
	        
	        return answer;
	    }
	}
