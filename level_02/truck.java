package level_02;

import java.util.*;

public class truck {
	class Solution {
	    public int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        int sum = 0;
	        Queue<Integer> q = new LinkedList<>();
	        
	        for(int truck : truck_weights){
	            while(true){
	                if(q.isEmpty()){
	                    q.add(truck);
	                    sum += truck;
	                    answer++;
	                    break;
	                }else if(q.size() == bridge_length){
	                    sum -= q.poll();
	                }else {
	                    if(sum + truck > weight){
	                        answer++;
	                        q.add(0);
	                    }else{
	                        q.add(truck);
	                        answer++;
	                        sum += truck;
	                        break;
	                    }
	                }
	            }
	        }
	        return answer + bridge_length;
	    }
	}
}
