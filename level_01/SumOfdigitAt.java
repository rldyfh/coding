package level_01;

public class SumOfdigitAt {
	public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for(int i = 0 ; i< str.length() ; i ++){
            answer += Character.getNumericValue(str.charAt(i));
        }
        
        
        
        return answer;
    }
}
