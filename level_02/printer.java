package level_02;

import java.util.*;
class printer {
    int location;
    int prior;
    public printer(int loc, int prior){
        this.location = loc;
        this.prior = prior;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<printer> q = new LinkedList<>();
        for(int i = 0 ; i < priorities.length ; i++){
            q.add(new printer(i, priorities[i]));
        }
        
        while(!q.isEmpty()){
            boolean flag = false;
            int tmp = q.peek().prior;
            for(printer p : q){
                if( tmp < p.prior){
                    flag = true;
                }
            }
            if(flag){
                q.add(q.poll());
            }else{ // 맨 앞 숫자가 가장 클때
                if(q.poll().location == location){
                    answer++;
                    break;
                }else{
                    answer++;
                }
            }
        }
        return answer;
    }
    
}