package level_01;

import java.util.*;

class Supo1 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int i=0;
        
        int[] supo = new int[3];
        
        for(i = 0 ; i < answers.length ; i++){
            if(answers[i] == supo1[i%supo1.length]){
                supo[0]++;
            }
            if(answers[i] == supo2[i%supo2.length]){
                supo[1]++;
            }
            if(answers[i] == supo3[i%supo3.length]){
                supo[2]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        
        int max = supo[0];
        for(i = 0; i< supo.length ; i++){
            if(max < supo[i]) max = supo[i];
        }
        
        for(i = 0 ; i < supo.length ; i++){
            if(max == supo[i]) list.add(i+1);
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
        for(i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
       
        return answer;
      
    }
}

public class Supo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2,3,4,5};
		
		Supo1 s = new Supo1();
		
		int[] c = s.solution(n);
		
		for(int i = 0 ; i< c.length ; i++) {
			System.out.println(c[i]);
		}
		
	}

}
