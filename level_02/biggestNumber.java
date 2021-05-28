package level_02;

public class biggestNumber {

	public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int n = number.length() - k;
        int start = 0;
        int max = 0;
        
        for(int i=0 ; i < n ; i++){
            max = 0;
            for(int j = start ; j <= i+k ; j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    start = j + 1;
                }
            }
            answer.append(max);
        }
        

        return answer.toString();
    }
}
