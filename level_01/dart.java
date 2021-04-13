package level_01;

public class dart {

	public int solution(String dartResult) {
        int answer = 0;
        double val = 0 ;
        int cnt = -1 ;
        double[] arr = new double[3];
        
        for(int i = 0 ; i < dartResult.length() ; i++) {
        	char ch = dartResult.charAt(i);
        	if('0' <= ch && ch <= '9') {
        		cnt++;
        		val = Character.getNumericValue(ch);
        		if(ch =='1' && dartResult.charAt(i+1) == '0') {
        			val = 10;
        			i++;
        		}
        	}
        	else if( ch =='S') {
        		val = Math.pow(val, 1);
        		arr[cnt] = val;
        	}
        	else if( ch =='D') {
        		val = Math.pow(val, 2);
        		arr[cnt] = val;
        	}
        	else if( ch =='T') {
        		val = Math.pow(val, 3);
        		arr[cnt] = val;
        	}
        	else if( ch =='*') {
        		if(cnt > 0 ) arr[cnt-1] *= 2;
        		arr[cnt] *= 2;
        	}
        	else if( ch =='#') {
        		arr[cnt] *= -1;
        	}
        }
        for(int i = 0 ; i < 3 ; i++) {
        	answer += arr[i];
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dart d = new dart();
		int b = d.solution(	"1D2S3T*");
		System.out.println(b);
	}

}
