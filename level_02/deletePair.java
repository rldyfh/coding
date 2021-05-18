package level_02;

import java.util.*;

public class deletePair {

	public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        int answer = -1;
        
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else if(!stack.isEmpty()){
                if(stack.peek() == c) stack.pop();
                else stack.push(c);
            } 
        }
        if(stack.size() == 0) answer = 1;
        else answer = 0;
        

        return answer;
    }
}
