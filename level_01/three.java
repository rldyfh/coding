package level_01;

class Three1 {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        int tmp = 0;
        
        if(n < 3) {
        	return n;
        }
        
    
        while(n / 3 != 0 ){
       		str += String.valueOf(n%3);
       		n = n / 3;
       		if(n < 3){
       			str += String.valueOf(n);
       		}
       	}
        
        for(int i = str.length()-1 ; i >= 0  ; i--){
        	char ch = str.charAt(str.length() - 1 - i);
        	tmp = Character.getNumericValue(ch);
            answer += tmp * Math.pow(3,i);
        }
        
        return answer;
        
    }
}

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three1 t = new Three1();
		System.out.print(t.solution(125));
	}

}
