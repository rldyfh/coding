package level_01;

public class phoneNumber {
	public String solution(String phone_number) {
        String answer = "";
        int i = 0;
        
        for( i = 0 ; i < phone_number.length() ; i ++){
            if(i < phone_number.length() - 4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }
}
