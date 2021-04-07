package level_01;

public class basic {
	public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0 ; i < s.length() ; i ++){
                if('0' > s.charAt(i) || s.charAt(i) > '9'){
                    return answer;
                }
            }
        }else{ 
            return false;
        }
        return true;
    }
}
