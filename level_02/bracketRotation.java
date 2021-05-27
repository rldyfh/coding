package level_02;

import java.util.*;

public class bracketRotation {
	public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i = -1 ; i < s.length()-1 ; i++){
            String tmp = s.substring(i+1, s.length()) + s.substring(0, i+1);
            for(int j = 0 ; j < tmp.length() ; j++){
                char ch = tmp.charAt(j);
                if( ch == '(' || ch =='[' || ch =='{' ){
                    stack.push(ch);
                }else if(ch == ')' || ch ==']' || ch =='}'){
                    if(stack.isEmpty()){
                        break;
                    }
                    else{
                        char pop = stack.pop();
                        if((pop == '(' && ch !=')') || (pop =='[' && ch !=']') || (pop=='{' && ch !='}')){
                            break;
                        }else{
                            if(j == tmp.length() -1) answer++;
                        } 
                    }
                }
            }
        }
        if(!stack.isEmpty()) answer = 0;
        return answer;
    }

}
