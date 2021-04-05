
package level_01;


class Solution {
    public String solution(String new_id) {
        String answer = "";
        String step1 ="";
        // 1
        step1 = new_id.toLowerCase();
        
        // 2
        String step2 = "";
        for(int i=0 ; i < step1.length() ; i++){
            char ch = step1.charAt(i);
            if('a' <=ch && ch <='z'){
                step2 += ch;
            }
            if(ch == '-' || ch =='_' || ch == '.'){
                step2 += ch;
            }
            if('0' <= ch && ch <='9'){
                step2 += ch;
            }
        }
        
        // 3
        while(step2.contains("..")){
            step2 = step2.replace("..", ".");
        }
        String step3 = step2;
        
        // 4
        String step4 = step3;
        if(step4.length() > 0) {
        	if(step4.charAt(0) =='.'){
        		step4 = step4.substring(1,step4.length());
        	}
        }
        if(step4.length() > 0) {
        	if(step4.charAt(step4.length()-1) == '.'){
            	step4 = step4.substring(0, step4.length()-1);
        	}
        }
        
        //5
        String step5 = step4;
        if(step5.length() == 0){
            step5 += "a";
        }
        
        //6
        String step6 = step5;
        if(step6.length() >= 16){
            step6 = step6.substring(0, 15);
            if(step6.charAt(step6.length() - 1) == '.'){
                step6 = step6.substring(0,step6.length() - 1);
            }
        }
        
        // 7
        String step7 = step6;
        if(step7.length() <= 2){
            char last = step7.charAt(step7.length()-1);
            
            while(step7.length() < 3){
                step7 += last;
            }
        }
        
        answer = step7;
        
        
        
        return answer;
    }
}

public class new_id {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "=.=";
		
		Solution sol = new Solution();
		str = sol.solution(str);
		System.out.println(str);
	}
}

