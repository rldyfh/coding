package level_02;

import java.util.*;

public class development {

	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Double> stack = new Stack<>();
        
        for(int i = progresses.length -1 ; i >=0 ; i--){
            stack.add(Math.ceil((double)(100-progresses[i]) / (double)speeds[i]));
        }
        
        while(!stack.empty()){
            double top = stack.pop();
            int cnt = 1;
            while(!stack.empty() && stack.peek() <= top){
                cnt++;
                stack.pop();
            }
            list.add(cnt);
        }
        answer = new int[list.size()];
        for(int i = 0 ; i < answer.length ; i ++){
            answer[i] = list.get(i);
        }
        
        
        
        
        return answer;
    }
}
