package level_01;

import java.util.*;

public class failure {
	public int[] solution(int N, int[] stages) {
		
		HashMap<Integer, Double> map = new HashMap<>();
        int[] answer = {};
        answer = new int[N];
        int i = 0, j = 0;
        int cnt1 = 0, cnt2 = 0;
        
        for(i = 1 ; i <= N ; i++){
            for(j = 0 ; j < stages.length ; j++){
                if( i == stages[j] ) cnt1++;
                if( i <= stages[j]) cnt2++;
            }
            double failureRate = 0;
            if(cnt1 != 0 && cnt2 != 0) {
            	failureRate = ((double)cnt1 / cnt2);
            }
            
            map.put(i, failureRate);
            cnt1=0;
            cnt2=0;
        }
        
        for(i = 0 ; i < N ; i ++) {
        	double max = -1;
        	int maxKey = 0;
        	for(Integer key : map.keySet()) {
        		if(max < map.get(key)) {
        			max = map.get(key);
        			maxKey = key;
        		}
        	}
        	answer[i] = maxKey;
        	map.remove(maxKey);
        }
        

        return answer;
    }

	public static void main(String[] args) {
		
		int[] arr = {2,1,2,6,2,4,3,3};
		failure f = new failure();
		int[] ans = f.solution(5, arr);
		
		for(int i=0; i < ans.length ; i++)
			System.out.println(ans[i]);
	}

}
