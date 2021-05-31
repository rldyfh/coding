package level_02;

import java.util.*;

public class bracket {

	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(') stack.push('(');
            else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) answer = false;

        return answer;
    }
}
