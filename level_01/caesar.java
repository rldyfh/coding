package level_01;

public class caesar {
	public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if('a' <= ch && ch <='z'){
                if((ch+n) > 'z') answer += (char)(ch-26+n);
                else answer += (char)(ch +n);
            }
            else if('A' <= ch && ch <='Z'){
                if((ch+n) > 'Z') answer += (char)(ch-26+n);
                else answer += (char)(ch +n);
            }
            else answer += ch;
        }
        return answer;
    }
}
